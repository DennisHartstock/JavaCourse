package com.example.lib.interfaces;

public class Bird extends Animal implements AbleToFly, AbleToRun {
    @Override
    public void eat() {
        System.out.println("bird food");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
