package com.acercow.collection;

public class TestCollection {
    public static void main(String[] args) {
        IterClass iterClass = new IterClass();
        for (String s : iterClass) {
//            System.out.print(" -> " + s);
        }

        ExtIterClass extIterClass = new ExtIterClass();
        for (String s : extIterClass.reverse()) {
            System.out.print(" -> " + s);
        }


    }
}

