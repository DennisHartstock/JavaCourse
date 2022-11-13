package com.example.lib.multithreading;

import java.util.Random;

public class Main {
    private static boolean isRightNumber;

    public static void main(String[] args) {
        final int bound = 1_000_000_000;
        final Random random = new Random();
        final int number = random.nextInt(bound);

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                int guessNumber;

                do {
                    guessNumber = random.nextInt(bound);
                } while (guessNumber != number);

                System.out.printf("You Won! Number is %s", number);
                isRightNumber = true;
            }
        });
        thread.start();

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < bound; i++) {

                    if (isRightNumber) {
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
        thread2.start();

//        Timer timer = new Timer();
//        Thread thread = new Thread(timer);
//        thread.start();
//        for (int i = 0; i < 1_000_000; i++) {
//            System.out.println(2);
//        }
    }
}
