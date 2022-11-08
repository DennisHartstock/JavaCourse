package com.example.lib.basics;

public class ConditionalOperator {

    public static void main(String[] args) {
        int temp = 30;
        boolean isHot = temp >= 25;
        boolean isCold = temp <= 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6;

        if (isHot && !isNight) {
            System.out.println("Air Conditioner is ON");
        } else if (isCold) {
            System.out.println("Air Conditioner is OFF");
        } else {
            System.out.println("Room temperature is optimal");
        }
    }
}
