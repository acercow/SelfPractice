package com.acercow.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedStack<T>  {
    public Node<T> top = new Node<>();

    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {}

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
    }

    public static class Fruit {}

    public static class Apple extends Fruit {
        public static <T> List<T> list() {
            return new ArrayList<>(5);
        }
    }

    public static class Orange extends Fruit {}

    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }
    public static void typeInference(List<? extends Fruit> list) {
    }

    public static void typeInference2(Map<String, List<? extends Fruit>> list) {

    }

    public static class Animal<F extends Fruit> {
        public void eat(F fruit) {
            System.out.println(fruit.getClass().getSimpleName());
        }
    }

    public static void lip(Animal<? extends Orange> animal) {

    }

    public static void main(String[] args) {
//        LinkedStack<Integer> linkedStack = new LinkedStack<>();
//        Fruit[] fruits = new Apple[4];
////        fruits[1] = new Fruit();
//        fruits[2] = new Apple();
//
//        List<? extends Fruit> lt = Apple.list();
//        List<? extends Fruit> lt2 = new ArrayList<Apple>(5);
//        lt2.add(null);
//        lt2.add(null);
//        lt2.add(null);
//        Fruit f = lt2.get(2);
//        List<Fruit> lit2 = new ArrayList<>();
//        lit2.add(new Apple());
//        typeInference2(map());
//
//        Animal<Apple> animal = new Animal<>();
//        animal.eat(new Apple());
//        List l = new ArrayList();
//        List<String> list = l;
//        list.add("asdf");
    }

}

