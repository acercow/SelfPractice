package com.acercow.collection;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Cappocino.class, Latti.class, Mokka.class};
    private static Random random = new Random();
    private int size;

    public CoffeeGenerator() {}

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            int r = random.nextInt(types.length);
            return (Coffee) types[r].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }


    class CoffeeIterator implements Iterator<Coffee> {
        int n = size;

        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Coffee next() {
            n--;
            System.out.println(n + "  ");

            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator cg =  new CoffeeGenerator();
        for(Coffee c : cg) {
            System.out.println(c);
        }
    }
}
