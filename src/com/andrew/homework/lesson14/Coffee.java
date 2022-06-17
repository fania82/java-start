package com.andrew.homework.lesson14;

public class Coffee extends Drink {

    private final String coffeeType;

    public Coffee(int price, String coffeeType) {
        super(price);
        this.coffeeType = coffeeType;
    }

    public String toString() {
        return coffeeType +  " costs: " + price + " USD";
    }
}