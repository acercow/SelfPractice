package com.acercow.designpattern.adapter;

/**
 * Created by Jansen on 2017/9/9.
 */
public class ClassAdapter extends ReizAdaptee implements IReizPremium {
    @Override
    public void sportKit() {
        System.out.println("==== Premium SportKit ====");
    }


    public static void main(String[] args) {
        ClassAdapter adapter = new ClassAdapter();
        adapter.engineStart();
        adapter.shift();
        adapter.sportKit();
    }
}
