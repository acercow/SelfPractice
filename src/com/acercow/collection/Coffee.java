package com.acercow.collection;

public class Coffee {
    private static int count;
    private final static int id = count++;

    @Override
    public String toString() {
        return "Coffee :: " + this.getClass().getSimpleName();
    }
}
