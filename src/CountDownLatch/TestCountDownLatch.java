package CountDownLatch;

import java.util.concurrent.TimeUnit;

public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        Latch latch = new CountDownLatch(4);
        new ProgrammerTraver("jack", latch, "car").start();
        new ProgrammerTraver("rose", latch, "bike").start();
        new ProgrammerTraver("tom", latch, "bus").start();
        new ProgrammerTraver("lily", latch, "walking").start();
        latch.await();
//        try {
//            latch.await(TimeUnit.SECONDS, 5);
//
//        }catch (WaitTimeOutException e){
//            e.printStackTrace();
//        }
        System.out.println("== all of programmer arrived==");
    }
}
