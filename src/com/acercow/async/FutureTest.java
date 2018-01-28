package com.acercow.async;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FutureTest {

    public static void main(String[] args) {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        }, 0, 1, TimeUnit.SECONDS);

    }
}

