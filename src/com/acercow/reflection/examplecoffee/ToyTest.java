package com.acercow.reflection.examplecoffee;

/**
 * Created by Administrator on 2017/2/8.
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name    : " + cc.getName() + " is interface? [" + cc.isInterface() + "] ");
        System.out.println("Simple name   : " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        try {
            c = Class.forName("com.acercow.reflection.examplecoffee.FancyToy");
            printInfo(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for(Class inface : c.getInterfaces()) {
            printInfo(inface);
        }

        Class superClass = c.getSuperclass();

        try {
            Object obj = superClass.newInstance();
            printInfo(obj.getClass());

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {

    public FancyToy() {
        super(1);
    }
}
