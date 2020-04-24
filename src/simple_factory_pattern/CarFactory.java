package simple_factory_pattern;

public class CarFactory {
    public static <T extends Car> T getInstance(Class<T> clz) {
        Car car = null;
        try {
            car = (Car) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
