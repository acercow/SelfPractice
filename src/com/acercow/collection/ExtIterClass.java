package com.acercow.collection;

import java.util.Iterator;

public class ExtIterClass extends IterClass {
    public Iterable<String> reverse() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int index = strs.length - 1;
                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public String next() {
                        return strs[index--];
                    }
                };
            }
        };
    }
}
