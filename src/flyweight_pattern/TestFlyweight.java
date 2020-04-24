package flyweight_pattern;

public class TestFlyweight {
    public static void main(String[] args) {
        String extrinsic = "name";
        Flyweight flyweight = FlyweightFactory.getFlyweight(extrinsic);
        flyweight.operate();
    }
}
