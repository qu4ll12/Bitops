package core.output.clone.operators.rightshift;
import static core.TestGeneration.path.MarkedPath.markOneStatement;
public class BitPosition {
public static void main(String[] args) {
{
markOneStatement("System.out.println(\"First set-bit position for number: 18 is -> \" + helper(18));\n", false, false, 112);
System.out.println("First set-bit position for number: 18 is -> " + helper(18));
markOneStatement("System.out.println(\"First set-bit position for number: 5 is -> \" + helper(5));\n", false, false, 201);
System.out.println("First set-bit position for number: 5 is -> " + helper(5));
markOneStatement("System.out.println(\"First set-bit position for number: 32 is -> \" + helper(32));\n", false, false, 288);
System.out.println("First set-bit position for number: 32 is -> " + helper(32));
}

}
public static int helper(int n) {
{
if (((n == 0) && markOneStatement("n == 0", true, false, 617)) || markOneStatement("n == 0", false, true, 617))
{
{
markOneStatement("return 0;\n", false, false, 639);
return 0;
}
}
markOneStatement("int k=1;\n", false, false, 668);
int k=1;
while (true) {
markOneStatement("true", true, false, 695);
{
if (((((n >> (k - 1)) & 1) == 0) && markOneStatement("((n >> (k - 1)) & 1) == 0", true, false, 719)) || markOneStatement("((n >> (k - 1)) & 1) == 0", false, true, 719))
{
{
markOneStatement("k++;\n", false, false, 764);
k++;
}
}
else {
{
markOneStatement("return k;\n", false, false, 806);
return k;
}
}
}
}
}

}
public static final int BitPositionTotalStatement = 20;
}
