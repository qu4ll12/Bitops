package core.output.testDriver;

import core.TestGeneration.result.RamStorage;
import core.output.clone.com.thealgorithms.bitmanipulation.OneBitDifference;
import java.util.List;

public class TestDriver {
    public static void main(String[] args) {
        List<Object> outputs = RamStorage.getOutputs();
        if (args.length != 2) {
            throw new IllegalArgumentException("Expected 2 arguments, got " + args.length);
        }
        int arg0 = parseArg0(args[0]);
        int arg1 = parseArg1(args[1]);
        try {
            Object output = OneBitDifference.differByOneBit(arg0, arg1);
            outputs.add(output);
        } catch (Throwable throwable) {
            outputs.add(new core.TestGeneration.result.ExceptionOutput(throwable));
        }
    }
    private static int parseArg0(String arg) {
        return Integer.parseInt(arg);
    }
    private static int parseArg1(String arg) {
        return Integer.parseInt(arg);
    }
}
