package com.example.lib.exceptions;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }

//        int a = 0;
//        try {
//            int b = 7 / a;
//            int c = Integer.parseInt("one");
//        }catch (ArithmeticException ae) {
//            System.out.println("Error: " + ae);
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
//        System.out.println("Hello");
    }
}
