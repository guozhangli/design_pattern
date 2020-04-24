package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadHook {

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                System.out.println("the hook thread 1 is running");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("the hook thread 1 will exit");
        }));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                System.out.println("the hook thread 2 is running");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("the hook thread 2 will exit");
        }));

        System.out.println("the program is will stop");
    }
}
