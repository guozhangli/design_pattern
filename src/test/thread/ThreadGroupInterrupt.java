package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadGroupInterrupt {

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("group1");

        Thread t1 = new Thread(group, () -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            System.out.println("t1 will exit");
        }, "T1");

        t1.start();

        Thread t2 = new Thread(group, () -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            System.out.println("t2 will exit");
        }, "T2");

        t2.start();

        group.interrupt();
    }
}
