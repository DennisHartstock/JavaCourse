package com.example.lib.multithreading;

import java.util.Random;

public class GuessTheNumber {
    private static boolean isNumber;

    public static void main(String[] args) {
        final int number = new Random().nextInt(10);

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {

                    if (isNumber) {
                        System.out.printf("Number is %s", number);
                        break;
                    }

                    int guessNumber = new Random().nextInt(10);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (guessNumber == number) {
                        isNumber = true;
                    }
//                    System.out.println("Not guess");
                }
            }
        });
        thread.start();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 1; i < 100; i++) {

                    if (isNumber) {
                        break;
                    }
                    System.out.println(i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
    }
}
