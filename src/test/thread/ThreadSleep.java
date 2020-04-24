package test.thread;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            sleep(2_000L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms", (endTime - startTime)));
        });
        t.start();
        System.out.println("id:".concat(String.valueOf(t.getId())));
        long startTime = System.currentTimeMillis();
        sleep(3_000L);
        System.out.println("main:id:".concat(String.valueOf(Thread.currentThread().getId())));
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("main thread total spend %d ms", (endTime - startTime)));
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() == this);
            }
        }.start();
        System.out.println("main".equals(Thread.currentThread().getName()));
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
