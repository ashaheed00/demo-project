package com.aksh.collectiondemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> rollBook = new HashMap<>();
//        Map<Integer, String> rollBook = new Hashtable<>();

        rollBook.put(45, "John");
        rollBook.put(15, "Alice");
        rollBook.put(34, "Ram");
        rollBook.put(19, "Rahul");
        rollBook.put(null, "Rahul"); // null key isn't allowed in HashTable
        rollBook.put(15, "Abc");

        System.out.println(rollBook);
        System.out.println(rollBook.get(45));
        rollBook.remove(19);
        System.out.println(rollBook);
        System.out.println(rollBook.keySet());

        if (rollBook.containsKey(100)) {
            System.out.println(rollBook.get(100));
        } else {
            System.out.println("default");
        }

        System.out.println(rollBook.getOrDefault(100, "default"));
        System.out.println(rollBook.getOrDefault(34, "default"));

        rollBook.remove(15,"Alice");
        System.out.println(rollBook);
        rollBook.remove(15,"Abc");
        System.out.println(rollBook);

        rollBook.putIfAbsent(45,"AAA");
        System.out.println(rollBook);

        rollBook.putIfAbsent(20,"AAA");
        System.out.println(rollBook);

    }
}
