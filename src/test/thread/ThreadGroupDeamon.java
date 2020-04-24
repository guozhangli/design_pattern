package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadGroupDeamon {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup group1 = new ThreadGroup("group1");

        Thread t1 = new Thread(group1, () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T1");

        t1.start();

        ThreadGroup group2 = new ThreadGroup("group2");
        Thread t2 = new Thread(group2, () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T2");

        t2.start();


        group2.setDaemon(true);

        TimeUnit.SECONDS.sleep(3);
        System.out.println("group1" + group1.isDestroyed());
        System.out.println("group2" + group2.isDestroyed());
    }
}
