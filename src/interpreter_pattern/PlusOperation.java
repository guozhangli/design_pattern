package interpreter_pattern;

public class PlusOperation extends NonTerminalExpression {
    PlusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) + this.e2.interpreter(context);
    }
}
