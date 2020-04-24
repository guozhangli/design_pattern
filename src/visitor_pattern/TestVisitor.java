package visitor_pattern;

public class TestVisitor {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        Node node = new NodeA();
        Node node1 = new NodeB();

        objectStructure.addList(node);
        objectStructure.addList(node1);
        objectStructure.action(new VisitorB());

        objectStructure.removeList();//清除list的内容

        objectStructure.addList(node);
        objectStructure.addList(node1);
        objectStructure.action(new VisitorA());

    }
}
