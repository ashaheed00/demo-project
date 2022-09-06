package com.aksh;

public class StaticDemo {
    static int num;
    static String name;

    public StaticDemo() {
        System.out.println("in constructor");
    }

    static {
        num = 20;
        System.out.println("in static block");
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        StaticDemo.num = 25;
        obj1.name = "obj1";
        obj2.name = "obj2";

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        ApGpProblem.apGp(5, 3, 5);
    }

}
