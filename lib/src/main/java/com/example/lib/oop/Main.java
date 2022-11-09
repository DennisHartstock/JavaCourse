package com.example.lib.oop;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimens(10, 10, 10);
        box1.showVolume();

        Box box2 = new Box();
        box2.setDimens(20, 20, 20);
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

        Test test = new Test();
        System.out.println(test.square(20));

        Rectangle rectangle = new Rectangle();
        rectangle.setDimens(20, 10);
        System.out.println(rectangle.getArea());
    }
}
