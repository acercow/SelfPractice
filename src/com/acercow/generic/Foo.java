package com.acercow.generic;

public class Foo<T> {
    T element;

    public  Foo(FactoryI<T> factory) {
        element = factory.create();
    }


    public static void main(String[] args) {
        Foo<String> foo = new Foo<>(new FactoryI<String>() {
            @Override
            public String create() {
                return "zhaosen";
            }
        });

        Foo<Integer> foo2 = new Foo<>(new IntegerFactory());

        System.out.println(foo2.element);
    }
}
