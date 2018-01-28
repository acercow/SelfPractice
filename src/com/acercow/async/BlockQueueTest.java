package com.acercow.async;

import java.util.concurrent.*;

public class BlockQueueTest {

     public static void main(String[] args) {

//         BlockingQueue queue = new ArrayBlockingQueue(1024);
//
//         try {
//             queue.put("1");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         CountDownLatch latch = new CountDownLatch(3);
//         new Thread(new Waiter(latch)).start();
//         new Thread(new Decrementer(latch)).start();
//
//         try {
//             Thread.sleep(8000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }


//         ExecutorService executor = Executors.newCachedThreadPool();
//         Future future = executor.submit(new Callable<Object>() {
//             @Override
//             public Object call() throws Exception {
//                 Thread.sleep(5000);
//                 System.out.println("Clal");
//                 return "Callable End";
//             }
//         });
//
//         executor.shutdown();

         Callable runnable = new TestRun();
         ExecutorService executor = new ThreadPoolExecutor(0, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
         executor.submit(runnable);

         executor.submit(runnable);
         executor.submit(runnable);

         executor.submit(runnable);
         executor.submit(runnable);
         executor.submit(runnable);
         executor.submit(runnable);
         executor.submit(runnable);

         executor.shutdown();


         System.out.println("Main");
//         try {
//             System.out.println(future.get());
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         } catch (ExecutionException e) {
//             e.printStackTrace();
//         }
     }


}


class TestRun implements Callable<Object> {
             @Override
             public Object call() throws Exception {
                 Thread.sleep(1000);
                 System.out.println(Thread.currentThread());
                 return "Callable End";
             }
         }

class Waiter implements Runnable {
    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter Released");
    }
}

class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            latch.countDown();
            Thread.sleep(1000);
            latch.countDown();
            Thread.sleep(1000);
            latch.countDown();
            Thread.sleep(1000);
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Decrementer End");
    }
}



