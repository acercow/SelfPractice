package com.acercow.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArray<T> {
    private Class<T> kind;

    public GenericArray(Class<T> kind) {
        this.kind = kind;
    }

    public T[] create(int size) {
//        return (T[])Array.newInstance(kind, 10);
        return (T[]) new Object[size];
    }

    public T create2() {
//            return kind.newInstance();
        return (T) new Object();
    }


    public static void main(String[] args) {
        GenericArray<String> genericArray = new GenericArray<>(String.class);
//        String[] strings = genericArray.create(10);
//        System.out.println(Arrays.toString(strings));


        String strings1 = genericArray.create2();
        System.out.println(strings1);


        GenericArray<Fruit> fruitGenericArray = new GenericArray<>(Fruit.class);
        System.out.println(fruitGenericArray.create2());

    }
}
