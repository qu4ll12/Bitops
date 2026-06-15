package core.utils;

import javax.tools.JavaCompiler;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class Compiler {
    private static Compiler instance = null;

    private Compiler() {}

    public static Compiler getInstance() {
        if (instance == null) {
            instance = new Compiler();
        }
        return instance;
    }

    public void compileJavaFile(String javaFilePath, String outputDir) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new IllegalStateException(
                    "System Java compiler not available. Make sure you are running on a JDK, not a JRE.");
        }

        File sourceFile = new File(javaFilePath);
        if (!sourceFile.exists()) {
            throw new IllegalArgumentException("Source file does not exist: " +
                    sourceFile.getAbsolutePath());
        }

        File outputDirectory = new File(outputDir);
        if (!outputDirectory.exists() && !outputDirectory.mkdirs()) {
            throw new IOException("Failed to create output directory: " + outputDir);
        }

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        try (StandardJavaFileManager fileManager =
                     compiler.getStandardFileManager(diagnostics, null, null)) {
            Iterable<? extends JavaFileObject> units =
                    fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile));

            String currentCp = System.getProperty("java.class.path");
            StringBuilder cpBuilder = new StringBuilder();
            if (currentCp != null && !currentCp.isEmpty()) {
                cpBuilder.append(currentCp);
            }
            String classpath = cpBuilder.toString();

            List<String> options = Arrays.asList(
                    "-classpath", classpath,
                    "-d", outputDir
            );

            JavaCompiler.CompilationTask task = compiler.getTask(
                    null, fileManager, diagnostics, options, null, units
            );

            Boolean success = task.call();
            if (success == null || !success) {
                throw new RuntimeException("Compilation failed for: " + javaFilePath
                        + formatDiagnostics(diagnostics));
            }
        }
    }

    private static String formatDiagnostics(DiagnosticCollector<JavaFileObject> diagnostics) {
        if (diagnostics.getDiagnostics().isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
            result.append(System.lineSeparator())
                    .append(diagnostic.getKind())
                    .append(": ");
            JavaFileObject source = diagnostic.getSource();
            if (source != null) {
                result.append(source.getName())
                        .append(":")
                        .append(diagnostic.getLineNumber())
                        .append(":")
                        .append(diagnostic.getColumnNumber())
                        .append(" ");
            }
            result.append(diagnostic.getMessage(null));
        }
        return result.toString();
    }
}
