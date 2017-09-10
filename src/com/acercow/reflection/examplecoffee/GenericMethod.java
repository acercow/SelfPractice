package com.acercow.reflection.examplecoffee;

/**
 * Created by Administrator on 2017/2/7.
 */
public class GenericMethod {
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.f(1);
        gm.f("zhaosen");
        gm.f('a');
        gm.f(gm);


    }
}
