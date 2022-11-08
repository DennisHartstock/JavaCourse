package com.example.lib.basics;

public class WhatToDo {

    public static void main(String[] args) {
        int time = 23;
        boolean isNight = time > 22 || time < 6;
        boolean isGoodWeather = false;

        if (time > 6 && time < 10 || time > 14 && time < 18) {
            System.out.println("Learn");
        }

        if (time > 10 && time < 12) {
            if (isGoodWeather)
                System.out.println("Go jogging");
            if (!isGoodWeather) {
                System.out.println("Go to the gym");
            }
        }

        if (!isNight) {
            System.out.println("Read books");
        }

        if (isNight) {
            System.out.println("Sleep");
        }
    }
}
