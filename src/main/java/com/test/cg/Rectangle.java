package com.test.cg;

public class Rectangle implements AreaClass {

    // Rectangle class
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getArea() {
        return length * breadth;
    }
}
