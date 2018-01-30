package com.acercow.generic;

public class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return 23;
    }
}
