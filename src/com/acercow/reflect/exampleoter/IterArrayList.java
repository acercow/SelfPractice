package com.acercow.reflect.exampleoter;

import java.util.Iterator;

public class IterArrayList implements Iterable<String> {

        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public String next() {
                    return null;
                }
            };
        }
    }