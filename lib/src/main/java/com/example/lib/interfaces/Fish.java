package com.example.lib.interfaces;

public class Fish extends Animal implements AbleToSwim {

    @Override
    public void eat() {
        System.out.println("fish food");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
