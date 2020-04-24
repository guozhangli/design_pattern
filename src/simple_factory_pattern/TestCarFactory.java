package simple_factory_pattern;

public class TestCarFactory {

    public static void main(String[] args) {
        Car byd = CarFactory.getInstance(Byd.class);
        byd.setName("byd");
        byd.printName();

        Car toyta = CarFactory.getInstance(Toyta.class);
        toyta.setName("toyta");
        toyta.printName();
    }
}
