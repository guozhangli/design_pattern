package abstract_factory_pattern;

public class WindowsText extends WindowsProduct {
    @Override
    public void text() {
        super.text();
        System.out.println("this is windows text");
    }
}
