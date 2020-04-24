package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    public List<Node> list = new ArrayList<>();

    public void action(Visitor visitor) {
        for (Node node : list) {
            node.accept(visitor);
        }
    }

    public void addList(Node node) {
        list.add(node);
    }

    public void removeList() {
        list.clear();
    }
}
