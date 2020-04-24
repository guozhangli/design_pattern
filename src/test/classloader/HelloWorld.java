package test.classloader;

public class HelloWorld {

    static {
        System.out.println("hello world class is initialized.");
    }

    public String welcome() {
        return "hello world";
    }
}
