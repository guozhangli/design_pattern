package ThreadPool;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class BasicThreadPool extends Thread implements ThreadPool {

    private final int initSize;

    private final int maxSize;

    private final int coreSize;

    private int activeCount;

    private final ThreadFactory threadFactory;

    private final RunnableQueue runnableQueue;

    private volatile boolean isShutDown = false;

    private final Queue<ThreadTask> queue = new ArrayDeque<>();

    private final static DenyPolicy DEFULT_DENY_POLICY = new DenyPolicy.DiscardDenyPolicy();

    private final static ThreadFactory DEFULT_THREAD_FACTORY = new DefaultThreadFactory();

    private final long keepAliveTime;

    private final TimeUnit timeUnit;

    public BasicThreadPool(int initSize, int maxSize, int coreSize, int queueSize) {

        this(initSize, maxSize, coreSize, DEFULT_THREAD_FACTORY, queueSize, DEFULT_DENY_POLICY, 10, TimeUnit.SECONDS);
    }

    public BasicThreadPool(int initSize, int maxSize, int coreSize, ThreadFactory threadFactory,
                           int queueSize, DenyPolicy denyPolicy, long keepAliveTime, TimeUnit timeUnit) {
        this.initSize = initSize;
        this.maxSize = maxSize;
        this.coreSize = coreSize;
        this.threadFactory = threadFactory;
        this.runnableQueue = new LinkedRunnableQueue(queueSize, denyPolicy, this);
        this.keepAliveTime = keepAliveTime;
        this.timeUnit = timeUnit;
        this.init();
    }

    private void init() {
        start();
        for (int i = 0; i < initSize; i++) {
            newThread();
        }
    }

    private void newThread() {
        InnerTask innerTask = new InnerTask(runnableQueue);
        Thread thread = this.threadFactory.createThread(innerTask);
        ThreadTask threadTask = new ThreadTask(thread, innerTask);
        queue.offer(threadTask);
        this.activeCount++;
        thread.start();
    }

    private void removeThread() {
        ThreadTask threadTask = queue.remove();
        threadTask.innerTask.stop();
        this.activeCount--;
    }

    @Override
    public void execute(Runnable runnable) {
        if (this.isShutDown) {
            throw new IllegalStateException("the thread pool is destroy");
        }
        this.runnableQueue.offer(runnable);
    }

    @Override
    public void run() {
        while (!isShutDown && !isInterrupted()) {

            try {
                timeUnit.sleep(keepAliveTime);
            } catch (InterruptedException e) {
                this.isShutDown = true;
                break;
            }

            synchronized (this) {
                if (isShutDown) {
                    break;
                }
                if (runnableQueue.size() > 0 && activeCount < coreSize) {
                    for (int i = initSize; i < coreSize; i++) {
                        newThread();
                    }
                    continue;
                }

                if (runnableQueue.size() > 0 && activeCount < maxSize) {
                    for (int i = activeCount; i < maxSize; i++) {
                        newThread();
                    }
                }
                if (runnableQueue.size() == 0 && activeCount > coreSize) {
                    for (int i = coreSize; i < activeCount; i++) {
                        removeThread();
                    }
                }
            }

        }
    }

    @Override
    public void shutdown() {
        synchronized (this) {
            if (isShutDown) {
                return;
            }
            isShutDown = true;
            queue.forEach(e -> {
                e.innerTask.stop();
                e.thread.interrupt();
            });
            this.interrupt();
        }
    }

    @Override
    public int getInitSize() {
        if (this.isShutDown) {
            throw new IllegalStateException("the thread pool is destroy");
        }
        return this.initSize;
    }

    @Override
    public int getMaxSize() {
        if (this.isShutDown) {
            throw new IllegalStateException("the thread pool is destroy");
        }
        return this.maxSize;
    }

    @Override
    public int getCoreSize() {
        if (this.isShutDown) {
            throw new IllegalStateException("the thread pool is destroy");
        }
        return this.coreSize;
    }

    @Override
    public int getQueueSize() {
        if (this.isShutDown) {
            throw new IllegalStateException("the thread pool is destroy");
        }
        return runnableQueue.size();
    }

    @Override
    public int getActiveCount() {
        synchronized (this) {
            return this.activeCount;
        }
    }

    @Override
    public boolean isShutDown() {
        return this.isShutDown;
    }


    static class ThreadTask {
        public ThreadTask(Thread thread, InnerTask innerTask) {
            this.thread = thread;
            this.innerTask = innerTask;
        }

        Thread thread;
        InnerTask innerTask;
    }

    static class DefaultThreadFactory implements ThreadFactory {

        private static final AtomicInteger GROUP_COUNTER = new AtomicInteger(1);
        private static final ThreadGroup group = new ThreadGroup("MyThreadPool-" + GROUP_COUNTER.getAndDecrement());
        private static final AtomicInteger COUNTER = new AtomicInteger(0);

        @Override
        public Thread createThread(Runnable runnable) {
            return new Thread(group, runnable, "thread-pool-" + COUNTER.getAndDecrement());
        }
    }
}
