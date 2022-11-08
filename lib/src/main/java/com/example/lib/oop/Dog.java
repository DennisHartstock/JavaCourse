package com.example.lib.oop;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String getInfo() {
        return "Name: " + name + ", breed: " + breed + ", weight: " + weight + " kg";
    }

    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("i'm running");
        }
    }
}
