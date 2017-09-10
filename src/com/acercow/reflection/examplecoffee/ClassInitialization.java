package com.acercow.reflection.examplecoffee;

/**
 * Created by Administrator on 2017/2/9.
 */
public class ClassInitialization {

    public static void main(String[] args) {
//        System.out.println(com.acercow.reflection.examplecoffee.Initable.staticNonFinal);


        try {

            // forName()初始化statc block
            Class<?> c = Class.forName("com.acercow.reflection.examplecoffee.Initable");
            Class<? extends Initable> fi = (Class<? extends Initable>) Class.forName("com.acercow.reflection.examplecoffee.Finalable");

            Class<? super Initable> inClass = Initable.class;
            Class<? super Initable> s = inClass.getSuperclass();
            Class<?> intClass = int.class;
            intClass = double.class;

            inClass.isInstance(c);

//            Map<String, Integer> mma = new HashMap<>();
//            for(Map.Entry<String, Integer> pair: mma.entrySet()) {
//
//            }
            Initable ini = new Finalable();

            Class<Finalable> f = Finalable.class;
            Finalable iniF = f.cast(ini);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Initable {
    static int staticNonFinal = 57;

    static {
        System.out.println("static block");
    }

    public Initable() {
        System.out.println("__Constructor");
    }
}


class Finalable extends Initable{}
