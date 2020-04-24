package facade_pattern;

/**
 * 外观模式（门面模式）
 */
public class Facade {
    private Class1 class1 = new Class1();
    private Class2 class2 = new Class2();
    private Class3 class3 = new Class3();

    public void method1() {
        class1.method1();
    }

    public void method2() {
        class2.method2();
    }

    public void method3() {
        class3.method3();
    }
}
