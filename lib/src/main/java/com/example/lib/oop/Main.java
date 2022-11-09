package com.example.lib.oop;

public class Main {

    public static void main(String[] args) {
        Monster monster = new Monster(4, 8, 4);
        System.out.println(monster.arms);
        monster.voice(3, "Aaaaaaa....");
    }
}
