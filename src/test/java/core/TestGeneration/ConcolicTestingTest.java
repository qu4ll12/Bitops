package core.TestGeneration;

import core.CFG.Utils.ASTHelper;
import core.TestGeneration.testDriver.TestDriverGenerator;
import core.TestGeneration.testDriver.TestDriverUtils;
import core.utils.CloneProject;
import core.utils.ProjectParser;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConcolicTestingTest {
    @Test
    public void fullyClonedClassNameUsesPackageDeclarationInsteadOfTempPath() throws Exception {
        ParsedUnit parsed = parseSourceInMismatchedTempPath("""
                package operators.rightshift;

                public class BitPosition {
                    private static int helper(int n) {
                        if (n == 0) {
                            return 0;
                        }

                        int k = 1;
                        while (true) {
                            if (((n >> (k - 1)) & 1) == 0) {
                                k++;
                            } else {
                                return k;
                            }
                        }
                    }
                }
                """, "BitPosition.java");

        String fullyClonedClassName = ConcolicTesting.buildFullyClonedClassName(
                parsed.compilationUnit, "BitPosition");
        assertEquals("core.output.clone.operators.rightshift.BitPosition", fullyClonedClassName);

        MethodDeclaration helper = findMethod(parsed.methods, "helper");
        String driverSource = TestDriverGenerator.buildTestDriverSource(
                helper,
                TestDriverUtils.getParameterClasses(helper.parameters()),
                fullyClonedClassName,
                "BitPosition");

        assertTrue(driverSource.contains(
                "import core.output.clone.operators.rightshift.BitPosition;"));
        assertFalse(driverSource.contains("ide_preview_"));

        String cloneSource = createCloneSource(parsed.compilationUnit);
        compileGeneratedSources(
                SourceFile.of("BitPosition.java", cloneSource),
                SourceFile.of("TestDriver.java", driverSource));
    }

    @Test
    public void fullyClonedClassNameForDefaultPackageUsesCloneRootOnly() throws Exception {
        ParsedUnit parsed = parseSourceInMismatchedTempPath("""
                public class DefaultPackageClass {
                    public static int helper(int n) {
                        return n + 1;
                    }
                }
                """, "DefaultPackageClass.java");

        String fullyClonedClassName = ConcolicTesting.buildFullyClonedClassName(
                parsed.compilationUnit, "DefaultPackageClass");

        assertEquals("core.output.clone.DefaultPackageClass", fullyClonedClassName);
    }

    private static ParsedUnit parseSourceInMismatchedTempPath(String source, String fileName) throws Exception {
        Path inputDir = Path.of("target", "test-inputs", "ide_preview_12345", "emLoc");
        Files.createDirectories(inputDir);
        Path sourceFile = inputDir.resolve(fileName);
        Files.writeString(sourceFile, source);

        ProjectParser parser = new ProjectParser();
        parser.loadFile(sourceFile.toString());
        return new ParsedUnit(parser.getCompilationUnit(), parser.getMethods());
    }

    private static MethodDeclaration findMethod(List<ASTNode> methods, String methodName) {
        return methods.stream()
                .map(MethodDeclaration.class::cast)
                .filter(method -> method.getName().getIdentifier().equals(methodName))
                .findFirst()
                .orElseThrow();
    }

    private static String createCloneSource(CompilationUnit compilationUnit) throws Exception {
        Method createCloneSourceCode = CloneProject.class.getDeclaredMethod(
                "createCloneSourceCode", CompilationUnit.class, ASTHelper.Coverage.class);
        createCloneSourceCode.setAccessible(true);
        return (String) createCloneSourceCode.invoke(null, compilationUnit, ASTHelper.Coverage.STATEMENT);
    }

    private static void compileGeneratedSources(SourceFile... sourceFiles) throws Exception {
        Path sourceDir = Path.of("target", "test-generated-sources", "concolic");
        Path outputDir = Path.of("target", "test-generated-classes", "concolic");
        Files.createDirectories(sourceDir);
        Files.createDirectories(outputDir);

        List<Path> paths = new java.util.ArrayList<>();
        for (SourceFile sourceFile : sourceFiles) {
            Path file = sourceDir.resolve(sourceFile.name);
            Files.writeString(file, sourceFile.content);
            paths.add(file);
        }

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fileManager =
                     compiler.getStandardFileManager(null, null, null)) {
            Boolean success = compiler.getTask(
                    null,
                    fileManager,
                    null,
                    List.of("-classpath", "target/classes", "-d", outputDir.toString()),
                    null,
                    fileManager.getJavaFileObjectsFromFiles(
                            paths.stream().map(Path::toFile).toList())
            ).call();

            assertTrue(success);
        }
    }

    private record ParsedUnit(CompilationUnit compilationUnit, List<ASTNode> methods) {
    }

    private record SourceFile(String name, String content) {
        static SourceFile of(String name, String content) {
            return new SourceFile(name, content);
        }
    }
}
