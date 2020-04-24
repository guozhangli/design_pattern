package bridge_pattern;

public class ConcreteImpl1 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("dosomething-concreteImpl1");
    }

    @Override
    public void doAnything() {
        System.out.println("doanything-concreteImpl1");
    }
}
