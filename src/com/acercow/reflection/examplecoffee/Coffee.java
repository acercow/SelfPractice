package com.acercow.reflection.examplecoffee;

/**
 * Created by Administrator on 2017/2/7.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
