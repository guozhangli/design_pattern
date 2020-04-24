package test.thread;

import java.util.concurrent.TimeUnit;

public class ThreadGroupBasic {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("group1");

        Thread thread = new Thread(group1, () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T1");

        thread.setDaemon(true);
        thread.start();

        TimeUnit.MILLISECONDS.sleep(1);

        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        System.out.println("activeCount=" + mainGroup.activeCount());
        System.out.println("activeGroupCount=" + mainGroup.activeGroupCount());
        System.out.println("getMaxPriority=" + mainGroup.getMaxPriority());
        System.out.println("getName=" + mainGroup.getName());
        System.out.println("getParent=" + mainGroup.getParent());

        System.out.println("-----------------------");
        mainGroup.getParent().list();

        System.out.println("------------------------");
        mainGroup.list();

        System.out.println("-------------------------");
        System.out.println("parentOf=" + mainGroup.parentOf(group1));
        System.out.println("parentOf=" + mainGroup.parentOf(mainGroup));

    }
}
