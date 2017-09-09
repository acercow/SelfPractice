package com.acercow.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill (Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }

        return coll;
    }




    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>(), new CoffeeGenerator(), 20));
    }
}
