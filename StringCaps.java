package com.aksh;

import java.util.Scanner;

public class StringCaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String word = sc.next();
//            System.out.println(word.substring(0, 1).toUpperCase().concat(word.substring(1).toLowerCase()));
//        }

        String word = sc.next();
        StringBuffer wordSB = new StringBuffer(word);
        wordSB.reverse();
        System.out.println(wordSB);
        if (wordSB.toString().equals(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        wordSB.append(12);
        word.concat(Integer.toString(12));
        System.out.println(Integer.parseInt("12"));
        System.out.println(Math.pow(2,5));
    }
}
