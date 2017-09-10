package com.acercow.reflection.examplecoffee;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Administrator on 2017/2/7.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class};
    private static Random rand = new Random(47);

    public CoffeeGenerator() {

    }

    private int size = 0;
    public CoffeeGenerator(int sz) { size = sz; }


    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        private int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator(6);
        System.out.println("Result:");
        for(Coffee c: gen) {
            System.out.println(c);
        }
    }
}
