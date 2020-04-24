package interpreter_pattern;

public abstract class NonTerminalExpression implements Expression {
    Expression e1, e2;

    NonTerminalExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
}
