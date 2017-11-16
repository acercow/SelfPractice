package com.acercow.async;

/**
 * Created by Administrator on 2017/11/10.
 */
public class MainThread {
    private ThreadLocal<String>  mThreadLocal = new ThreadLocal<>();

    public MainThread() {
        mThreadLocal.set("zhaosen");
        new Thread(() -> {
            System.out.println("sub -> " + mThreadLocal.get());
        }).start();

        System.out.println("main -> " + mThreadLocal.get());
    }
}
