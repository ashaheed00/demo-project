package com.aksh.collectiondemo;

import com.aksh.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(2);
        nums.add(23);
        nums.add(12);
        nums.add(2);
        System.out.println(nums);

        Set<Student> students = new TreeSet<>();

        students.add(new Student(106, "John", 12));
        students.add(new Student(102, "Alice", 9));
        students.add(new Student(105, "Rahul", 11));
        students.add(new Student(101, "Jia", 5));
        students.add(new Student(101, "Jia", 5));

        students.forEach(System.out::println);
    }
}
