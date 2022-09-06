package com.aksh.demo;

public class Circle extends Shape {

    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getDimension() {
        System.out.println("2D Circle");
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
