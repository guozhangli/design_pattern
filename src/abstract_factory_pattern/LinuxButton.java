package abstract_factory_pattern;

public class LinuxButton extends LinuxProduct {
    @Override
    public void button() {
        super.button();
        System.out.println("this is linux button");
    }
}
