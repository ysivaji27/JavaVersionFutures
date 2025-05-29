package com.test.cg;

public abstract class Shape {
    public abstract double getArea();

    public void display() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Area: " + getArea());
        System.out.println("---------------------------");
    }
}