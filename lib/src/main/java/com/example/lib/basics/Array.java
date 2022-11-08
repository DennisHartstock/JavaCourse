package com.example.lib.basics;

public class Array {

    public static void main(String[] args) {
        String[] namesOfMonths = new String[12];
        namesOfMonths[0] = "January";
        namesOfMonths[1] = "February";
        namesOfMonths[2] = "March";
        namesOfMonths[3] = "April";
        namesOfMonths[4] = "May";
        namesOfMonths[5] = "June";
        namesOfMonths[6] = "July";
        namesOfMonths[7] = "August";
        namesOfMonths[8] = "September";
        namesOfMonths[9] = "October";
        namesOfMonths[10] = "November";
        namesOfMonths[11] = "December";

        for (int i = 0; i < namesOfMonths.length - 1; i++) {
            System.out.print(namesOfMonths[i] + ", ");
        }
        System.out.println(namesOfMonths[namesOfMonths.length - 1] + ".");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i] + ".");
            }
        }
    }
}
