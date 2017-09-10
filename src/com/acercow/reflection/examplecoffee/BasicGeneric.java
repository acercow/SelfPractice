package com.acercow.reflection.examplecoffee;

/**
 * Created by Administrator on 2017/2/7.
 */
public class BasicGeneric<T> implements Generator<T> {
    private Class<T> clz;

    public BasicGeneric(Class<T> clz) {
        this.clz = clz;
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGeneric<T>(type);
    }

    @Override
    public T next() {
        try {
            return clz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Generator<CountedObject> bg = BasicGeneric.create(CountedObject.class);
        System.out.println(bg.next());
    }
}
