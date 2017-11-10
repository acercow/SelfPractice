package com.acercow.collection;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        for (int i : integers) {
            System.out.println("integer : " + i);
        }
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

