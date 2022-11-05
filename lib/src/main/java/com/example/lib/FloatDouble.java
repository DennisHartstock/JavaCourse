package com.example.lib;

public class FloatDouble {

    public static void main(String[] args) {
        float radius = 10.8f;
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println(area);

        int ageVita = 13;
        int ageLilli = 46;
        int ageDennis = 46;
        double ageAverage = (ageVita + ageLilli + ageDennis) / 3f;
        System.out.println(ageAverage);
    }
}
