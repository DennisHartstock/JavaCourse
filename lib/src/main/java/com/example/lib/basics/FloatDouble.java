package com.example.lib.basics;

public class FloatDouble {
    protected static int ageVita = 13;
    protected static int ageLilli = 46;
    protected static int ageDennis = 46;

    public static void main(String[] args) {
        float radius = 10.8f;
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println(area);

        double ageAverage = (ageVita + ageLilli + ageDennis) / 3f;
        System.out.println(ageAverage);
    }
}
