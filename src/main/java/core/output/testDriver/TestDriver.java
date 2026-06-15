package core.output.testDriver;

import core.TestGeneration.result.RamStorage;
import core.output.clone.operators.rightshift.BitPosition;
import java.util.List;

public class TestDriver {
    public static void main(String[] args) {
        List<Object> outputs = RamStorage.getOutputs();
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected 1 arguments, got " + args.length);
        }
        int arg0 = parseArg0(args[0]);
        Object output = BitPosition.helper(arg0);
        outputs.add(output);
    }
    private static int parseArg0(String arg) {
        return Integer.parseInt(arg);
    }
}
