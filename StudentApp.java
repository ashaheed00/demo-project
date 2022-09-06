package com.aksh;

public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.std = 10;
        s1.rollNo = 123;

        Student s2 = new Student();
        s2.name = "Ram";
        s2.std = 11;
        s2.rollNo = 12;

        s1.getDetails();
        s2.getDetails();
        System.out.println(s1.rollNo);

        Student s3 = new Student(12, "ABC", 8);
        s3.getDetails();
        System.out.println(s3.rollNo);
    }
}
