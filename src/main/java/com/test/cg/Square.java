package com.test.cg;

public class Square implements AreaClass    {
    // Square class
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
