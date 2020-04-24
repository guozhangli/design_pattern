package abstract_factory_pattern;

public class LinuxText extends LinuxProduct {
    @Override
    public void text() {
        super.text();
        System.out.println("this is linux text");
    }
}
