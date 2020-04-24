package visitor_pattern;

public class NodeB extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String operation() {
        return "operation node b";
    }
}
