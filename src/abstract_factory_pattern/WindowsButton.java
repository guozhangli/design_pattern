package abstract_factory_pattern;

public class WindowsButton extends WindowsProduct {
    @Override
    public void button() {
        super.button();
        System.out.println("this is windows button");
    }
}
