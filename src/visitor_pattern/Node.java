package visitor_pattern;

public abstract class Node {

    public abstract void accept(Visitor visitor);

    public abstract String operation();
}
