package interpreter_pattern;

public class TestInterpreter {
    public static void main(String[] args) {
        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");
        context.add(a, 4);
        context.add(b, 8);
        context.add(c, 2);
        int i = new MinusOperation(a, b).interpreter(context);
        System.out.println(i);
    }
}
