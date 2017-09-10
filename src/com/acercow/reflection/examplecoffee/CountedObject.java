package com.acercow.reflection.examplecoffee;

/**
 * Created by Administrator on 2017/2/7.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() { return id; }
    public String toString() {
        return getClass().getSimpleName() + " " + id;

    }


}
