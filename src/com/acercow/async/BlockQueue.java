package com.acercow.async;

import java.util.LinkedList;
import java.util.List;

public class BlockQueue  {
    private List<Runnable> taskQueue = null;
    private int limit;

    public BlockQueue(int queueSize) {
        taskQueue = new LinkedList<>();
        this.limit = queueSize;
    }


    public void enqueue(Runnable runnable) throws InterruptedException {
        synchronized (taskQueue) {
            if (taskQueue.size() >= limit) {
                taskQueue.wait();
            }
            if (taskQueue.size() == 0) {
                taskQueue.notifyAll();
            }
            taskQueue.add(runnable);
        }
    }

//    public Runnable dequeue() {
//        synchronized (taskQueue) {
//            if (taskQueue.size() <= 0) {
//
//            }
//        }
//    }
}
