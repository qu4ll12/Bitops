package core.TestGeneration;

import core.CFG.Utils.ASTHelper;
import core.TestGeneration.result.ExceptionOutput;
import core.TestGeneration.result.RamStorage;
import core.TestGeneration.result.TestData;
import core.TestGeneration.testDriver.TestDriverGenerator;
import core.TestGeneration.testDriver.TestDriverUtils;
import core.utils.FilePath;
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
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConcolicTestingTest {
    @Test
    public void bitSwapPackageCloneAndDriverUseSameFullyQualifiedName() throws Exception {
        ParsedUnit parsed = parseSource("""
                package com.thealgorithms.bitmanipulation;

                public final class BitSwap {
                    private BitSwap() {
                    }

                    public static int bitSwap(int data, final int posA, final int posB) {
                        if (posA < 0 || posA >= Integer.SIZE || posB < 0 || posB >= Integer.SIZE) {
                            throw new IllegalArgumentException("Bit positions must be between 0 and 31");
                        }

                        boolean bitA = ((data >> posA) & 1) != 0;
                        boolean bitB = ((data >> posB) & 1) != 0;
                        if (bitA != bitB) {
                            data ^= (1 << posA) ^ (1 << posB);
                        }
                        return data;
                    }
                }
                """, "BitSwap.java");

        String fullyClonedClassName = ConcolicTesting.buildFullyClonedClassName(
                parsed.compilationUnit, "BitSwap");
        assertEquals("core.output.clone.com.thealgorithms.bitmanipulation.BitSwap",
                fullyClonedClassName);

        MethodDeclaration method = findMethod(parsed.methods, "bitSwap");
        String driverSource = TestDriverGenerator.buildTestDriverSource(
                method,
                TestDriverUtils.getParameterClasses(method.parameters()),
                fullyClonedClassName,
                "BitSwap");

        assertTrue(driverSource.contains(
                "import core.output.clone.com.thealgorithms.bitmanipulation.BitSwap;"));
        assertFalse(driverSource.contains("ide_preview_"));

        String cloneSource = createCloneSource(parsed.compilationUnit);
        assertTrue(cloneSource.contains(
                "package core.output.clone.com.thealgorithms.bitmanipulation;"));

        compileGeneratedSources(
                SourceFile.of("core/output/clone/com/thealgorithms/bitmanipulation/BitSwap.java", cloneSource),
                SourceFile.of("core/output/testDriver/TestDriver.java", driverSource));
    }

    @Test
    public void defaultPackageCloneClassNameUsesCloneRoot() throws Exception {
        ParsedUnit parsed = parseSource("""
                class DefaultPackageClass {
                    public static int helper(int value) {
                        return value + 1;
                    }
                }
                """, "DefaultPackageClass.java");

        assertEquals("core.output.clone.DefaultPackageClass",
                ConcolicTesting.buildFullyClonedClassName(
                        parsed.compilationUnit, "DefaultPackageClass"));
    }

    @Test
    public void generatedDriverRecordsUnitExceptionAsOutput() throws Exception {
        ParsedUnit parsed = parseSource("""
                class ThrowingUnit {
                    public static int fail(int value) {
                        throw new IllegalArgumentException("bad value");
                    }
                }
                """, "ThrowingUnit.java");

        MethodDeclaration method = findMethod(parsed.methods, "fail");
        String driverSource = TestDriverGenerator.buildTestDriverSource(
                method,
                TestDriverUtils.getParameterClasses(method.parameters()),
                "core.output.clone.ThrowingUnit",
                "ThrowingUnit");
        String cloneSource = createCloneSource(parsed.compilationUnit);

        Path classesDir = compileGeneratedSources(
                SourceFile.of("core/output/clone/ThrowingUnit.java", cloneSource),
                SourceFile.of("core/output/testDriver/TestDriver.java", driverSource));

        RamStorage.reset();
        invokeGeneratedDriver(classesDir, "10");

        Object output = RamStorage.getOutputs().get(0);
        assertTrue(output instanceof ExceptionOutput);
        assertEquals("IllegalArgumentException: bad value", output.toString());

        TestData data = new TestData(
                List.of("value"),
                new Class<?>[] {int.class},
                new Object[] {10},
                Collections.emptySet(),
                output,
                50.0);
        assertEquals("EXCEPTION", data.getStatus());
    }

    private static ParsedUnit parseSource(String source, String fileName) throws Exception {
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

    private static Path compileGeneratedSources(SourceFile... sourceFiles) throws Exception {
        Path sourceDir = Path.of("target", "test-generated-sources", "concolic");
        Path outputDir = Path.of("target", "test-generated-classes", "concolic");
        Files.createDirectories(sourceDir);
        Files.createDirectories(outputDir);

        List<Path> paths = new ArrayList<>();
        for (SourceFile sourceFile : sourceFiles) {
            Path file = sourceDir.resolve(sourceFile.name);
            Files.createDirectories(file.getParent());
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
        return outputDir;
    }

    private static void invokeGeneratedDriver(Path classesDir, String... args) throws Exception {
        URL[] urls = {classesDir.toUri().toURL()};
        try (URLClassLoader loader = new URLClassLoader(urls, ConcolicTestingTest.class.getClassLoader()) {
            @Override
            protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                if (name.startsWith(FilePath.CLONED_PROJECT_ROOT_PACKAGE)
                        || name.startsWith(FilePath.TEST_DRIVER_FILE_PACKAGE_LOCATION)) {
                    synchronized (getClassLoadingLock(name)) {
                        Class<?> c = findLoadedClass(name);
                        if (c == null) {
                            try {
                                c = findClass(name);
                            } catch (ClassNotFoundException e) {
                                c = super.loadClass(name, resolve);
                            }
                        }
                        if (resolve) {
                            resolveClass(c);
                        }
                        return c;
                    }
                }
                return super.loadClass(name, resolve);
            }
        }) {
            Class<?> mainClass = loader.loadClass(FilePath.TEST_DRIVER_FILE_PACKAGE_LOCATION + ".TestDriver");
            Method mainMethod = mainClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) args);
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
