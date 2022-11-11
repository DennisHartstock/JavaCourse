package com.example.lib.inheritance;

public class CatFamily {
    protected int eyes;
    protected int legs;
    protected boolean canEatPerson;

//    public CatFamily() {
//        eyes = 2;
//        legs = 4;
//        canEatPerson = true;
//    }


    public CatFamily(int eyes, int legs, boolean canEatPerson) {
        this.eyes = eyes;
        this.legs = legs;
        this.canEatPerson = canEatPerson;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }
}
