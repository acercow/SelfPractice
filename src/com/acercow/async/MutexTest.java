package com.acercow.async;

import java.util.ArrayList;
import java.util.List;

public class MutexTest {

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer1 = new Consumer(producer, "Zhaosen");
        Consumer consumer2 = new Consumer(producer, "Chenmin");
        Consumer consumer3 = new Consumer(producer, "Wangshi");

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        try {
            Thread.sleep(10000);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

class Message {

}


class Producer extends Thread {


    private List<Message> mLists = new ArrayList<>();

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                Message msg = new Message();
                synchronized (mLists) {
                    mLists.add(msg);
                    mLists.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public List<Message> getLists() {
        return mLists;
    }

}

class Consumer extends Thread {
    List<? extends Message> list = new ArrayList<>();

    public Consumer(Producer producer, String threadName) {
        super(threadName);
        list = producer.getLists();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("[" + getName() + "]" + " Handle Message -> " + list.remove(0));
            }
        }
    }

}
