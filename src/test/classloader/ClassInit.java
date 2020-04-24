package test.classloader;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ClassInit {

    static {
        try {
            System.out.println("the ClassInt static code block will be invoke");
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ClassInit() {
        System.out.println("test consititution function");
    }

    {
        System.out.println("test consititution method");
    }

    public static void main(String[] args) {
        System.out.println("test main function");
        IntStream.range(0, 1).forEach(i -> new Thread(ClassInit::new).start());

    }
}
