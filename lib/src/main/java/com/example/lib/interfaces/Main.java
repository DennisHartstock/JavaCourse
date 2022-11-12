package com.example.lib.interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Developer developer = new Developer();
        Cook cook = new Cook();

        ArrayList<Worker> workingPersons = new ArrayList<>();
        workingPersons.add(director);
        workingPersons.add(developer);
        workingPersons.add(cook);
        for (Worker worker : workingPersons) {
            worker.work();
        }

        ArrayList<Driver> drivingPersons = new ArrayList<>();
        drivingPersons.add(developer);
        drivingPersons.add(cook);
        for (Driver driver : drivingPersons) {
            driver.drive();
        }


//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);

//        for (Animal animal : animals) {
//            animal.eat();
//        }

//        ArrayList<AbleToRun> runningAnimals = new ArrayList<>();
//        runningAnimals.add(cat);
//        runningAnimals.add(dog);
//        runningAnimals.add(bird);
//
//        for (AbleToRun animal : runningAnimals) {
//            animal.run();
//        }
//
//        bird.fly();
//        fish.swim();

//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;
//        dog.run();
    }
}
