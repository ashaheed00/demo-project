package com.aksh;

public class StringUtils {

    public static void main(String[] args) {
        String name = "    Rahul   ";
        String dept = new String("Civil");

        name.toUpperCase();
        System.out.println(name);
//        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.concat(" Roy"));
        System.out.println(name.isEmpty());
        System.out.println(name.trim());
        System.out.println(dept.charAt(1));
        System.out.println(dept.substring(2));
        System.out.println(dept.substring(1, 3));

        // Equals
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
