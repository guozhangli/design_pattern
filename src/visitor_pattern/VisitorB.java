package visitor_pattern;

public class VisitorB implements Visitor {

    @Override
    public void visit(Node node) {
        System.out.println(node.operation());
    }
}
