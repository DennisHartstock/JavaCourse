package com.example.lib.interfaces;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
//        WaiterBob waiterBob = new WaiterBob();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Here is your " + dish);
            }
        }, "Fish");

//        Director director = new Director();
////        Developer developer = new Developer();
//        director.force(new Worker() {
//
//            @Override
//            public void work() {
//                System.out.println("I'm working");
//            }
//        });
    }
}
