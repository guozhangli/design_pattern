package test.thread;

import java.util.concurrent.TimeUnit;

public class BooleanLockTest2 {
    public static void main(String[] args) throws InterruptedException {
        BooleanLockTest blt = new BooleanLockTest();
        new Thread(blt::syncMethod, "T1").start();
        TimeUnit.SECONDS.sleep(2);

        Thread t1 = new Thread(blt::syncMethod, "T2");
        t1.start();
        TimeUnit.SECONDS.sleep(4);
        t1.interrupt();//可中断
    }
}
