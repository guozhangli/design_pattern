package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadIsInterupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {

            }
        });
        thread.setDaemon(true);//设为守护线程
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf("Thread is interrupted ? %s\n", thread.isInterrupted());
        thread.interrupt();
        System.out.printf("Thread is interupted ? %s\n", thread.isInterrupted());

    }

}
