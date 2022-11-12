package com.example.lib.test;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int dice = random.nextInt(6) + 1;
            System.out.printf("Dice value: %s%n", dice);
        }

//        for (int i = 0; i < 20; i++) {
//            int randomInt = random.nextInt(6) + 5;
//            System.out.print(randomInt + " ");
//        }

//        Person person = new Person("John", 25);
//        System.out.println(person);
    }
}