package factory_pattern;

public class TestFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Acura acura = carFactory.getInstance(Acura.class);
        acura.getCarName();
        Benz benz = carFactory.getInstance(Benz.class);
        benz.getCarName();
        Bmw bmw = carFactory.getInstance(Bmw.class);
        bmw.getCarName();
    }
}
