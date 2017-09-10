package com.acercow.reflection.examplecoffee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/10.
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {

    private Class<?> baseType;


    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if(!baseType.isAssignableFrom(type)) {
            throw new RuntimeException(obj + " incorrect type");
        }
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);

        Class<?> superClass = type.getSuperclass();
        if(superClass != null && baseType.isAssignableFrom(superClass)) {
          countClass(superClass);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for(Map.Entry<Class<?>, Integer> pair : entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        Coffee c1 = new Cappuccino();
        Coffee c2 = new Latte();
        counter.count(c1);
        counter.count(c2);

        System.out.println(counter);
    }

}
