package visitor_pattern;

import java.nio.file.FileVisitor;

public class TestVisitor {
    /**
     * 访问者模式：把不变的固定起来，变化的开放出去。
     * 某些较为稳定的东西（数据结构或算法），不想直接被改变但又想扩展功能，这时候适合用访问者模式。
     * 说到对于访问者模式使用场景的定义，我们会觉得模板方法模式与这个使用场景的定义很像。但它们还是有些许差别的。
     * 访问者模式的变化与非变化（即访问者与被访问者）之间，它们只是简单的包含关系，而模板方法模式的变化与非变化则是继承关系。
     * 但它们也确实有类似的地方，即都是封装了固定不变的东西，开放了变动的东西。
     * @param args
     */
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
