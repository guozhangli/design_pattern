package test.thread;

import java.util.concurrent.TimeUnit;

public class BooleanLockTest3 {


    public static void main(String[] args) throws InterruptedException {
        BooleanLockTest blt = new BooleanLockTest();
        new Thread(blt::syncMethod, "T1").start();
        TimeUnit.MILLISECONDS.sleep(2);

        new Thread(blt::syncMethodTimeoutable, "T2").start();
        TimeUnit.MILLISECONDS.sleep(10);
    }
}
