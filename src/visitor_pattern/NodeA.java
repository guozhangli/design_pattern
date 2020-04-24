package visitor_pattern;

public class NodeA extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String operation() {
        return "operation node a";
    }
}
