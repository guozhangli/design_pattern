package adapter_pattern;

public class Adpatper extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("this is adpater class");
    }
}
