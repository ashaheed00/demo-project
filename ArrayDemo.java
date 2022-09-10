package com.aksh;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] nums = new int[3];
        int[] nums1 = {1, 2, 3};
        int nums2[] = {1, 2, 3};

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

        System.out.println(nums[1]);

        // Index out of bound
//        System.out.println(nums1[4]);

        for (int num : nums1) {
            System.out.println(num);
        }

        Student[] students = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student(101, "Marie", 12);
        Student s3 = new Student(102, "Alice", 9);

//        Student[] students = {s1,s2,s3};

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student);
        }

        // 2-D Array
        int[][] num2D = new int[2][3];

        for (int[] arr : num2D) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int a = num2D[1][1];

    }

}
