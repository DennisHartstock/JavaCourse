package com.example.lib.interfaces;

public class WaiterBob implements Waiter {

    @Override
    public void bringOrder(String dish) {
        System.out.println("Here is your " + dish);
    }
}
