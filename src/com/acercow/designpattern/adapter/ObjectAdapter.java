package com.acercow.designpattern.adapter;

/**
 * Created by Jansen on 2017/9/9.
 */
public class ObjectAdapter implements IReizPremium {
    ReizAdaptee adaptee;

    public ObjectAdapter(ReizAdaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void engineStart() {
        adaptee.engineStart();
    }

    @Override
    public void shift() {
        adaptee.shift();
    }

    @Override
    public void sportKit() {
        System.out.println("==== ReizPremium SportKit ====");
    }

    public static void main(String[] args) {
        ObjectAdapter adapter = new ObjectAdapter(new ReizAdaptee());
        adapter.engineStart();
        adapter.shift();
        adapter.sportKit();
    }
}
