package com.example.lib.interfaces;

public class Developer implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Developer is working");
    }

    @Override
    public void drive() {
        System.out.println("Developer is driving");
    }
}
