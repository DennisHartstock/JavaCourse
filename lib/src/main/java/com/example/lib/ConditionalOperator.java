package com.example.lib;

public class ConditionalOperator {

    public static void main(String[] args) {

        int temp = 23;

        if (temp > 25) {
            System.out.println("Air Conditioner is ON");
        } else if (temp < 22) {
            System.out.println("Air Conditioner is OFF");
        } else {
            System.out.println("Room temperature is optimal");
        }
    }
}
