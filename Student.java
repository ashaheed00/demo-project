package com.aksh;

import java.util.Objects;

public class Student {
    int rollNo;
    String name;
    int std;

    public Student() {
    }

    public Student(int rollNo, String name, int std) {
        this.rollNo = rollNo;
        this.name = name;
        this.std = std;
    }

    public void getDetails() {
        System.out.println(name + ": studies in class " + std);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && std == student.std && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, std);
    }

    @Override
    public String toString() {
        return "Student[" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", std=" + std +
                ']';
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "John", 11);
        Student s2 = new Student(10, "John", 11);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }


}
