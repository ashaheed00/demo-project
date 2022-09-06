package com.aksh;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator cal = new Calculator();
        int sum = cal.sum(a, cal.sum(a, b));
        int multi = cal.multiply(a, b);
        int sum1 = cal.sum(2, 8);

        System.out.println(sum);
        System.out.println(multi);
        System.out.println(sum1);
    }
}
