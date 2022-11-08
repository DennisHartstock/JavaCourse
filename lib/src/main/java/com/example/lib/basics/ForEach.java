package com.example.lib.basics;

public class ForEach {

    public static void main(String[] args) {
        String[] names = {
                "Vita",
                "Lilli",
                "Dennis"
        };

        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 + i;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
