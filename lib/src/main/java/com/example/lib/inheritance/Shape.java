package com.example.lib.inheritance;

public abstract class Shape {
    protected double a;
    protected double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }

    public abstract double getPerimeter();

    public final void showPerimeter() {
        System.out.println(getPerimeter());
    }
}
