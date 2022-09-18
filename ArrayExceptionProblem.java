package com.aksh.collectiondemo;

// hackerrank.com/challenges/java-arraylist/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExceptionProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> numList = new ArrayList<>();
        int it = sc.nextInt();

        for (int i = 0; i < it; i++) {
            int len = sc.nextInt();
            List<Integer> list = new ArrayList<>(len);
            for (int j = 0; j < len; j++) {
                list.add(sc.nextInt());
            }
            System.out.println(list);
            numList.add(list);
        }

        int checks = sc.nextInt();
        for (int i = 0; i < checks; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(numList.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
}
