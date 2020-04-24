package bridge_pattern;

public class TestBridge {
    public static void main(String[] args) {
        ConcreteAbstr1 concreteAbstr1 = new ConcreteAbstr1(new ConcreteImpl1());
        concreteAbstr1.request();

        ConcreteAbstr1 concreteAbstr11 = new ConcreteAbstr1(new ConcreteImpl2());
        concreteAbstr11.request();

    }
}
