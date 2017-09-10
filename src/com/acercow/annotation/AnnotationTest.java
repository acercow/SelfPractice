package com.acercow.annotation;

import java.util.*;

public class AnnotationTest {
    public static void main(String[] args) {
//        System.out.println("hello mac");

        Person person = new Person();
        person.setName("Nier");
        CustomUtils.getInfo(Person.class);


        Integer[] ins = {2,3,4,5};
        List<Integer> datas = Arrays.asList(ins);

        String str = "Nier";
        changeStr(str);
        System.out.println(str);

        ArrayList<String> al = new ArrayList<>();

        changeName(person);
        System.out.println(person.getName());

        datas.listIterator();
        IterArrayList ll = new IterArrayList();

        IterList lllll = new AnnotationTest().new IterList();

        for(String i : ll) {

        }

        LinkedList d;
        Stack stack;

        SortedSet ss = new TreeSet();

    }

    public NI ni() {
        return new NI();
    }


    public static void changeStr(String s) {
        s = "Mine";
    }

    public static void changeName(Person p) {
//        p.setName("Mine");
        Person p2 = new Person();
        p2.setName("Mine");
        p = p2;
    }

    public class NI {

    }


    public class DdList {
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Integer next() {
                    return null;
                }
            };
        }
    }


    public class IterList implements Iterable<String> {

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


    public class AbList extends AbstractCollection<String> {

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }

}
