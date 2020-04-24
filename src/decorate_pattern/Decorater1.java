package decorate_pattern;

public class Decorater1 extends Decorater {
    public Decorater1(Component component) {
        super(component);
    }

    public void dosomething() {
        System.out.println("do something");
    }

    protected void request() {
        super.request();
        dosomething();
    }
}
