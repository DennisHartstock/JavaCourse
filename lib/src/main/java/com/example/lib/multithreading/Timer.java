package com.example.lib.multithreading;

public class Timer implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println(1);
        }
    }
}
