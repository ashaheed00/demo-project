package com.aksh.demo;

public class ShapeApp {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.printArea();
        Triangle triangle = new Triangle();
        triangle.printArea();
        triangle.getDimension();
    }
}
