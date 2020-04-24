package test;

import javax.xml.bind.SchemaOutputResolver;
import java.util.stream.IntStream;

public class testThread {
    private final static String PREFIX = "ALEX-";

    public static void main(String[] args) {
        IntStream.range(0, 5).boxed().map(i -> new Thread(() -> System.out.println(Thread.currentThread().getName()))).forEach(Thread::start);

        IntStream.range(0, 5).mapToObj(testThread::createThread).forEach(Thread::start);
    }

    public static Thread createThread(int intName) {
        return new Thread(() -> System.out.println(Thread.currentThread().getName()), PREFIX.concat(String.valueOf(intName)));
    }
}
