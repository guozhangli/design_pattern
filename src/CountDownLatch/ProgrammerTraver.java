package CountDownLatch;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ProgrammerTraver extends Thread {
    private final String name;

    private final Latch latch;

    private final String transporation;

    public ProgrammerTraver(String name, Latch latch, String transportation) {
        this.name = name;
        this.latch = latch;
        this.transporation = transportation;
    }

    @Override
    public void run() {

        System.out.println(name + " start take the transporation [" + transporation + "]");
        try {
            TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " arrived by " + transporation);
        latch.countDown();
    }
}

