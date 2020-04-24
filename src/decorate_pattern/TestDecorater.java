package decorate_pattern;

public class TestDecorater {
    public static void main(String[] args) {
        Decorater1 decorater1 = new Decorater1(new ConcreteComponent());
        decorater1.request();
    }
}
