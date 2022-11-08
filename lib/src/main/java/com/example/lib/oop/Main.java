package com.example.lib.oop;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;
        box1.showVolume();

        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;
        box2.showVolume();

        Person vita = new Person();
        vita.name = "Vita";
        vita.age = 13;
        vita.weight = 50;

        Person lilli = new Person();
        lilli.name = "Lilli";
        lilli.age = 46;
        lilli.weight = 110;

        Person dennis = new Person();
        dennis.name = "Dennis";
        dennis.age = 46;
        dennis.weight = 85;

        float averageAge = (float) (vita.age + lilli.age + dennis.age) / 3;
        System.out.println(averageAge);

        Dog myDog = new Dog();
        myDog.name = "Sharik";
        myDog.breed = "unknown";
        myDog.weight = 5;
        myDog.speed = 3;
        System.out.println(myDog.getInfo());
        myDog.run();
    }
}
