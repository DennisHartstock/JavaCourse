package com.example.lib.basics;

public class WhatToEat {

    public static void main(String[] args) {

        int myMoney = 40;

        if (myMoney < 5) {
            System.out.println("Sandwich");
        } else if (myMoney < 10) {
            System.out.println("Hamburger");
        } else {
            System.out.println("Pizza");
        }
    }
}
