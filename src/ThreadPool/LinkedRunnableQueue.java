package ThreadPool;

import java.util.LinkedList;

public class LinkedRunnableQueue implements RunnableQueue {

    private final int limit;//队列上限

    private final DenyPolicy denyPolicy;//拒绝策略

    private final LinkedList<Runnable> runnableList = new LinkedList<>();//双向循环链表

    private final ThreadPool threadPool;//线程池

    public LinkedRunnableQueue(int limit, DenyPolicy denyPolicy, ThreadPool threadPool) {
        this.limit = limit;
        this.denyPolicy = denyPolicy;
        this.threadPool = threadPool;
    }

    @Override
    public void offer(Runnable runnable) {

        synchronized (runnableList) {
            if (runnableList.size() >= limit) {
                denyPolicy.reject(runnable, threadPool);
            } else {
                runnableList.addLast(runnable);
                runnableList.notifyAll();
            }
        }
    }

    @Override
    public Runnable take() throws InterruptedException {

        synchronized (runnableList) {
            while (runnableList.isEmpty()) {

                try {
                    runnableList.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            return runnableList.removeFirst();
        }

    }

    @Override
    public int size() {
        synchronized (runnableList) {
            return runnableList.size();
        }
    }
}
