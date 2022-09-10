package com.aksh.exc;

import java.util.Locale;

public class ExceptionHandlingDemo {

    static String name;

    public static void doSomething() throws NameNotFoundException {
        System.out.println("in doSomething");
        if (name == null) {
            throw new NameNotFoundException("name not found");
        }
    }

    public static void anotherMethod() {
        System.out.println("in anotherMethod");
        try {
            doSomething();
        } catch (NameNotFoundException e) {
            System.out.println("throwing NameNotFoundException");
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println(name.toUpperCase());
        }

        try {
            System.out.println(name.toUpperCase());
            int a = 2;
            int b = 2 / 0;
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("in finally block");
        }

        System.out.println("jjj");

        anotherMethod();

    }

}
