package bridge_pattern;

public class ConcreteAbstr1 extends Abstraction {
    public ConcreteAbstr1(Implementor impl) {
        super(impl);
    }

    @Override
    public void request() {
        super.request();
        super.getImpl().doSomething();
    }
}
