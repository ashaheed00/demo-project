package com.aksh.collectiondemo;

import com.aksh.Student;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(2);
        nums.add(23);
        nums.add(12);
        nums.add(2);
        System.out.println(nums);

        Set<Student> students = new HashSet<>();

        students.add(new Student(106, "John", 12));
        students.add(new Student(102, "Alice", 9));
        students.add(new Student(105, "Rahul", 11));
        students.add(new Student(101, "Jia", 5));
        students.add(new Student(101, "Jia", 5));

        System.out.println(students);

        // Useful methods
        // We have similar methods to List
        // get() and index related methods is not here since the order is not maintained in Set

    }
}
