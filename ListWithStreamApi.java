package com.aksh.collectiondemo;

import com.aksh.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithStreamApi {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(106, "John", 12));
        students.add(new Student(102, "Alice", 9));
        students.add(new Student(105, "Rahul", 11));
        students.add(new Student(101, "Jia", 5));
        Collections.sort(students, (s1, s2) -> s1.getRollNo() - s2.getRollNo());
//        students.forEach(s -> System.out.println(s));
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        students.forEach(s -> System.out.println(s));

        System.out.println(students.contains(new Student(106, "John", 12)));

        List<String> names = new ArrayList<>();
        students.forEach(s -> names.add(s.getName()));

//        for (Student s : students) {
//            names.add(s.getName());
//        }

        System.out.println(names);

//        List<String> nameList = students.stream().map(s -> s.getName()).collect(Collectors.toList());
//        List<String> nameList = students.stream().map(Student::getName).collect(Collectors.toList()); -- method referencing
        List<String> nameList = students.stream().map(s -> {
            String name = "Mr. ";
            return name + s.getName();
        }).collect(Collectors.toList());
        System.out.println(nameList);

    }
}
