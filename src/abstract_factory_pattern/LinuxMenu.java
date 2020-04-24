package abstract_factory_pattern;

public class LinuxMenu extends LinuxProduct {

    @Override
    public void meun() {
        super.meun();
        System.out.println("this is linux menu");
    }
}
