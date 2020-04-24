package test;

import javax.naming.spi.DirObjectFactory;
import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;

public class AppleTest {
    private static DoubleFunction<Double> f = x -> x + 10;

    public static void main(String[] args) {
        System.out.println(Integrate(f, 3, 7));
        Integrate((double x) -> x + 10, 3, 7);

        List<Apple> apples = new ArrayList<>();
        Apple apple = new Apple();
        apple.setColor("red");
        apples.add(apple);
        List<Apple> appleList = filterApple(apples, (Apple a) -> "red".equals(a.getColor()));
    }

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate ap) {
        List<Apple> apples1 = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i).getColor().equals("red")) {
                apples1.add(apples.get(i));
            }
        }
        return apples1;

    }

    public static double Integrate(DoubleFunction<Double> f, int x, int y) {
        return (f.apply(x) + f.apply(y)) * (y - x) * 3;
    }
}
