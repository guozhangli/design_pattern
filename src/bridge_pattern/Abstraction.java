package bridge_pattern;

public abstract class Abstraction {
    private Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public void request() {
        impl.doSomething();
    }

    public Implementor getImpl() {
        return this.impl;
    }
}
