package com.example.lib.oop;

public class Monster {
    int eyes;
    int arms;
    int legs;

    Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    Monster(int count) {
        this(count, count, count);
    }

    Monster() {
        this(2);
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrrrr...");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
