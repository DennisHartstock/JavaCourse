package com.example.lib.inheritance;

public final class Triangle extends Shape {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}