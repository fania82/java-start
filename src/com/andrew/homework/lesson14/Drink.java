package com.andrew.homework.lesson14;

public class Drink {

    public int price;

    public Drink (int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void prepareDrink() throws InterruptedException {
        System.out.println("The drink is being prepared");
        Thread.sleep(2500);
        System.out.println("The drink is prepared");
        Thread.sleep(2500);
    }




}
