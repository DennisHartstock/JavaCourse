package com.example.lib.interfaces;

public class Dog extends Animal implements AbleToRun, AbleToSwim {

    @Override
    public void eat() {
        System.out.println("dog food");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
