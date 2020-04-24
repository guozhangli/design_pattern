package interpreter_pattern;

public class TerminalExpression implements Expression {

    String var;

    TerminalExpression(String var) {
        this.var = var;
    }

    @Override
    public int interpreter(Context context) {
        return context.get(this);
    }
}
