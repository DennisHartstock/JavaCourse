package com.example.lib.oop;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box copy() {
        return new Box(length, width, height);
    }

    public Box increase() {
        return new Box(length * 2, width * 2, height * 2);
    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;

        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public void showInfo() {
        System.out.println("Length: " + length + "\nWidth: " + width + "\nHeight: " + height);
    }
}
