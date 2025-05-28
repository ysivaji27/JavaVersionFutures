package com.test.cg;

public class MainClass {
    public static void main(String[] args) {
        // Create a Circle object
        AreaClass circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        // Create a Square object
        Square square = new Square(4);
        System.out.println("Area of Square: " + square.getArea());
    }
}
