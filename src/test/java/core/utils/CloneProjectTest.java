package core.utils;

import core.CFG.Utils.ASTHelper;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Test;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CloneProjectTest {
    @Test
    public void cloneSourceWithAlwaysTrueWhileStillCompilesForNonVoidMethod() throws Exception {
        String cloneSource = createCloneSource("""
                class LoopReturn {
                    int find(int x) {
                        while (true) {
                            if (x > 0) {
                                return x;
                            }
                            x++;
                        }
                    }
                }
                """, "LoopReturn.java");

        assertTrue(cloneSource.contains("while (true)"));
        assertFalse(cloneSource.contains("while (((true)"));

        compileGeneratedSource("LoopReturn.java", cloneSource);
    }

    @Test
    public void medianCloneWithAlwaysTrueWhileCompiles() throws Exception {
        String cloneSource = createCloneSource("""
                class Solution {
                    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
                        int m = nums1.length, n = nums2.length;
                        int low = 0, high = m;
                        while (true) {
                            int partitionX = (low + high) >>> 1;
                            int partitionY = (m + n + 1) / 2 - partitionX;

                            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX - 1];
                            int minRightX = partitionX == m ? Integer.MAX_VALUE : nums1[partitionX];
                            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY - 1];
                            int minRightY = partitionY == n ? Integer.MAX_VALUE : nums2[partitionY];

                            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                                if (((m + n) & 1) == 0) {
                                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                                } else {
                                    return Math.max(maxLeftX, maxLeftY);
                                }
                            } else if (maxLeftX > minRightY) {
                                high = partitionX - 1;
                            } else {
                                low = partitionX + 1;
                            }
                        }
                    }
                }
                """, "Solution.java");

        assertTrue(cloneSource.contains("while (true)"));
        assertFalse(cloneSource.contains("while (((true)"));

        compileGeneratedSource("Solution.java", cloneSource);
    }

    @Test
    public void cloneSourceWithEscapedQuotesInStringLiteralCompiles() throws Exception {
        String cloneSource = createCloneSource("""
                import java.util.Arrays;

                class DecimalToBinary {
                    public static String decimalToBinaryUsingStack(int n) {
                        Arrays.asList("while loop breaks only when \\"number\\" terminates to : " + n, "  ")
                            .forEach(System.out::println);
                        return String.valueOf(n);
                    }
                }
                """, "DecimalToBinary.java");

        assertTrue(cloneSource.contains("while loop breaks only when"));

        compileGeneratedSource("DecimalToBinary.java", cloneSource);
    }

    @Test
    public void cloneSourcePathFollowsOriginalPackageDirectory() throws Exception {
        CompilationUnit compilationUnit = parseCompilationUnit("""
                package com.thealgorithms.bitmanipulation;

                public final class BitSwap {
                    public static int bitSwap(int data, int posA, int posB) {
                        return data;
                    }
                }
                """, "BitSwap.java");

        Path expected = Path.of(FilePath.JCIA_PROJECT_ROOT_PATH, FilePath.PATH_TO_CLONED_PROJECT)
                .resolve(Path.of("com", "thealgorithms", "bitmanipulation"))
                .resolve("BitSwap.java");

        assertEquals(expected, CloneProject.getCloneSourcePath(compilationUnit, "BitSwap.java"));
    }

    @Test
    public void cloneSourcePathForDefaultPackageStaysAtCloneRoot() throws Exception {
        CompilationUnit compilationUnit = parseCompilationUnit("""
                class DefaultPackageClass {
                    int helper(int value) {
                        return value;
                    }
                }
                """, "DefaultPackageClass.java");

        Path expected = Path.of(FilePath.JCIA_PROJECT_ROOT_PATH, FilePath.PATH_TO_CLONED_PROJECT)
                .resolve("DefaultPackageClass.java");

        assertEquals(expected, CloneProject.getCloneSourcePath(compilationUnit, "DefaultPackageClass.java"));
    }

    private static String createCloneSource(String source, String fileName) throws Exception {
        CompilationUnit compilationUnit = parseCompilationUnit(source, fileName);

        Method createCloneSourceCode = CloneProject.class.getDeclaredMethod(
                "createCloneSourceCode", CompilationUnit.class, ASTHelper.Coverage.class);
        createCloneSourceCode.setAccessible(true);
        String cloneSource = (String) createCloneSourceCode.invoke(
                null, compilationUnit, ASTHelper.Coverage.STATEMENT);

        return cloneSource;
    }

    private static CompilationUnit parseCompilationUnit(String source, String fileName) throws Exception {
        Path inputDir = Path.of("target", "test-inputs");
        Files.createDirectories(inputDir);
        Path sourceFile = inputDir.resolve(fileName);
        Files.writeString(sourceFile, source);

        ProjectParser parser = new ProjectParser();
        parser.loadFile(sourceFile.toString());
        return parser.getCompilationUnit();
    }

    private static void compileGeneratedSource(String fileName, String cloneSource) throws Exception {
        Path generatedDir = Path.of("target", "test-generated-sources");
        Files.createDirectories(generatedDir);
        Path generatedFile = generatedDir.resolve(fileName);
        Files.writeString(generatedFile, cloneSource);

        compileGeneratedSource(generatedFile);
    }

    private static void compileGeneratedSource(Path generatedFile) throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        Path outputDir = Path.of("target", "test-generated-classes");
        Files.createDirectories(outputDir);

        try (StandardJavaFileManager fileManager =
                     compiler.getStandardFileManager(null, null, null)) {
            Boolean success = compiler.getTask(
                    null,
                    fileManager,
                    null,
                    List.of("-classpath", "target/classes", "-d", outputDir.toString()),
                    null,
                    fileManager.getJavaFileObjectsFromFiles(List.of(generatedFile.toFile()))
            ).call();

            assertTrue(success);
        }
    }
}
