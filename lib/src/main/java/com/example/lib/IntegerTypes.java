package com.example.lib;

public class IntegerTypes {

    public static void main(String[] args) {
        int lightSpeed = 300_000;
        long distance = 365L * 24 * 60 * 60 * lightSpeed;
        System.out.println(distance);

        byte b = 10;
        b = (byte) (b + 10);
        System.out.println(b);
    }
}
