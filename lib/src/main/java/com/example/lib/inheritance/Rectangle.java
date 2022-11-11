package com.example.lib.inheritance;

public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
