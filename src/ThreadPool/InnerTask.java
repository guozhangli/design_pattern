package ThreadPool;

public class InnerTask implements Runnable {

    private final RunnableQueue runnableQueue;

    private volatile boolean running = true;

    public InnerTask(RunnableQueue runnableQueue) {
        this.runnableQueue = runnableQueue;
    }

    @Override
    public void run() {
        while (!running && !Thread.currentThread().isInterrupted()) {

            try {
                Runnable task = runnableQueue.take();
                task.run();
            } catch (Exception e) {
                running = false;
                break;
            }
        }
    }

    public void stop() {
        this.running = false;
    }
}
