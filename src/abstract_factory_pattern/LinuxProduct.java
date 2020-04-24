package abstract_factory_pattern;

public abstract class LinuxProduct implements IView {

    @Override
    public void meun() {
        System.out.println("show menu of linux");
    }

    @Override
    public void button() {
        System.out.println("show button of linux");
    }

    @Override
    public void text() {
        System.out.println("show text of linux");
    }
}
