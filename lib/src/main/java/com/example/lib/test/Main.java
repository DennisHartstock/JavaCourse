package com.example.lib.test;

import com.example.lib.inheritance.Cat;
import com.example.lib.inheritance.Lion;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.getLegs());
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
    }
}