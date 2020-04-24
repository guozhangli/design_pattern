package bridge_pattern;

public class ConcreteImpl2 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("dosomething-concreteImpl2");
    }

    @Override
    public void doAnything() {
        System.out.println("doanything-concreteImpl2");
    }
}
