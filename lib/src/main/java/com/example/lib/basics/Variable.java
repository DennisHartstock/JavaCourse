package com.example.lib.basics;

public class Variable {

    public static void main(String[] args) {

        int x = 5;
        int y = x + 5;
        System.out.println(y);

        int dollarsHasJohn = 100;
        int dollarsHasNick = dollarsHasJohn * 5;
        int dollarsSum = dollarsHasJohn + dollarsHasNick;
        System.out.println(dollarsSum);

        int a = 10;
        int b = 3;
        int c = a % b;
        System.out.println(c);

        int days = 10000;
        int years = days / 365;
        int months = (days % 365) / 30;
        int leftDays = (days % 365) % 30;
        System.out.println(years + " " + months + " " + leftDays);
    }
}
