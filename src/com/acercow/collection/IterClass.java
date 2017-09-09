package com.acercow.collection;

import java.util.Iterator;

public class IterClass implements Iterable<String> {
    public String[] strs = "we are the one in sina of China".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < strs.length;
            }

            @Override
            public String next() {
                return strs[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
