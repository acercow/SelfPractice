package com.acercow.io;

public class Successor extends Parent {

    public static void main(String[] args) {
        new Successor().test();
    }

    @Override
    public void test() {
        super.test();
    }

    @Override
    public void printMessage() {
        System.out.println("Successor");
    }
}
