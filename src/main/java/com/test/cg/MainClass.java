package com.test.cg;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);

        circle.display();
        rectangle.display();
        square.display();
    }
}
