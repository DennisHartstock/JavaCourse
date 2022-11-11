package com.example.lib.test;

import com.example.lib.inheritance.Rectangle;
import com.example.lib.inheritance.Triangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(1, 2, 3);
        rectangle.showPerimeter();
        triangle.showPerimeter();
    }
}