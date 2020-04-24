package test.thread;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.currentThread;

public class ThreadLoaclExample {

    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            try {
                threadLocal.set(i);
                System.out.println(currentThread() + " set i " + threadLocal.get());

                TimeUnit.SECONDS.sleep(2);
                System.out.println(currentThread() + " get i " + threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T" + i).start());
    }
}
