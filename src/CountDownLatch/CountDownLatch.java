package CountDownLatch;

import java.util.concurrent.TimeUnit;

public class CountDownLatch extends Latch {

    public CountDownLatch(int limit) {
        super(limit);
    }

    @Override
    public void await() throws InterruptedException {
        synchronized (this) {
            while (limit > 0) {
                this.wait();
            }
        }
    }

    @Override
    public void await(TimeUnit nuit, long time) throws InterruptedException, WaitTimeOutException {
        if (time < 0) {
            throw new IllegalArgumentException("the time is invalid");
        }
        long remainingNanos = nuit.toNanos(time);
        final long endNanos = System.nanoTime() + remainingNanos;
        synchronized (this) {
            if (TimeUnit.NANOSECONDS.toMillis(remainingNanos) <= 0) {
                throw new WaitTimeOutException("The wait time over specify time.");
            }
            this.wait(TimeUnit.NANOSECONDS.toMillis(remainingNanos));
            remainingNanos = endNanos - System.nanoTime();
        }
    }

    @Override
    public void countDown() {
        synchronized (this) {
            if (limit <= 0) {
                throw new IllegalStateException(" all of task alreay arrived");
            }
            limit--;
            this.notifyAll();
        }
    }

    @Override
    public int getUnarrived() {
        return this.limit;
    }
}
