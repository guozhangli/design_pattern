package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadInterrupted2 {
    public static void main(String[] args) {
        System.out.println("Main thread is interrupted?".concat(String.valueOf(Thread.interrupted())));

        Thread.currentThread().interrupt();

        System.out.println("Main thread is interrupted?".concat(String.valueOf(Thread.currentThread().isInterrupted())));

        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("I will bu interrupted still");
        }
    }
}
