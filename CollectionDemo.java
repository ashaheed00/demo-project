package com.aksh.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("hh");
//        list.add(2);
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(30);
        list.remove(Integer.getInteger("20"));
        System.out.println(list);
        list.add(15);
        list.add(12);
        list.add(150);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(30);
        list.removeAll(list1);
        System.out.println(list);
        System.out.println(list.size());
        list.get(2); // get 3rd element
        System.out.println(list.contains(155)); // false - doesn't contain

        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(15));
        System.out.println(list.indexOf(1500)); // returns -1 since the element is not there

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (a, b) -> b - a);

        list.forEach((n) -> {
            System.out.println(n + 10);
        });

    }
}
