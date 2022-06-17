package com.andrew.homework.lesson14;

public class Tea extends Drink {

    private final String teaType;

    public Tea(int price, String teaType) {
        super(price);
        this.teaType = teaType;
    }

    public String toString() {
        return teaType + " costs: " + price + " USD";
    }

}
