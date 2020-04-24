package abstract_factory_pattern;

public class WindowsProduct implements IView {
    @Override
    public void meun() {
        System.out.println("show menu of windows");
    }

    @Override
    public void button() {
        System.out.println("show button of windows");
    }

    @Override
    public void text() {
        System.out.println("show text of windows");
    }
}
