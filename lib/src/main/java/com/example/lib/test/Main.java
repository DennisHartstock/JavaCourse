package com.example.lib.test;

import com.example.lib.inheritance.Cat;
import com.example.lib.inheritance.Lion;
import com.example.lib.inheritance.WeightBox;
import com.example.lib.oop.Box;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        cat.eat();
        lion.eat();

        Box box = new Box(10);
        box.showInfo();
        WeightBox weightBox = new WeightBox(4, 3, 5, 10);
        weightBox.showInfo();
    }
}