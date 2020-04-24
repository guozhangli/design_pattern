package test;

import visitor_pattern.ObjectStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonitoringTest {

    /**
     * 死循环
     */
    public static void createBusyThread() {
        Runnable r = () -> {
            while (true)
                ;
        };
        Thread t = new Thread(r, "testBusyThread");
        t.start();
    }

    /**
     * 锁等待
     *
     * @param lock
     */
    public static void createLockThread(final Object lock) {
        Runnable r = () -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(r, "testLockThread");
        t.start();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();

        Object obj = new Object();
        createLockThread(obj);

    }
}
