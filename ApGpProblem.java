package com.aksh;

import java.util.Scanner;

public class ApGpProblem {

    public static void apGp(int a, int b, int n) {
        int element = a;
        for (int i = 0; i < n; i++) {
            element = (int) (element + Math.pow(2, i) * b);
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        ApGpProblem obj = new ApGpProblem();
        obj.apGp(a, b, n);


    }
}
