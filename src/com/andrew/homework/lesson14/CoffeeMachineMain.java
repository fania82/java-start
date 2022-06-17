package com.andrew.homework.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachineMain {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    static Drink americano = new Coffee(25, "Americano");
    static Drink cappuchino = new Coffee(30, "Cappuchino");
    static Drink latte = new Coffee(35, "Latte");
    static Drink greenTea = new Tea(22, "Green Tea");
    static Drink blackTea = new Tea(22, "Black Tea");

    public static void main(String[] args) throws IOException, InterruptedException {

        printDrinkList(americano, latte, cappuchino, greenTea, blackTea);
        System.out.println("Choose one or few drinks: 1 - americano, 2 - latte, 3 - cappuchino, 4 - green tea, 5 - black tea, 6 - finish choosing");
        ArrayList<Drink> chosenDrinks = chooseTypeOfDrink();
        System.out.println("You choose:");
        int sum = displayChosenDrinksAndTotalSum(chosenDrinks);
        System.out.println("Total sum of chosen drinks: " + sum + " USD");
        System.out.println("Prepare drinks? 1 - yes, 2 - no");
        prepareDrinks(chosenDrinks);
    }

    private static void prepareDrinks(ArrayList<Drink> chosenDrinks) throws IOException, InterruptedException {
        int prepareOrNot = Integer.parseInt(READER.readLine());
        if (prepareOrNot == 1) {
            for (Drink drinkList : chosenDrinks) {
                drinkList.prepareDrink();
            }
        }else if (prepareOrNot == 2) {
            System.out.println("Goodbye. See You later");
        } else {
            System.out.println("Not correct value");
        }
    }

    private static int displayChosenDrinksAndTotalSum(ArrayList<Drink> chosenDrinks) {
        int sum = 0;
        for (Drink drinkList : chosenDrinks) {
            System.out.println(drinkList);
            sum += drinkList.getPrice();
        }
        return sum;
    }

    public static void printDrinkList(Drink americano, Drink latte, Drink cappuchino, Drink greenTea, Drink blackTea) {
        System.out.println(americano + "\n" + latte + "\n" + cappuchino + "\n" + greenTea + "\n" + blackTea);
    }

    public static ArrayList<Drink> chooseTypeOfDrink() throws IOException {
        int typeOfDrink = Integer.parseInt(READER.readLine());
        ArrayList<Drink> drinks = new ArrayList<>();
        while (typeOfDrink != 6) {
            switch (typeOfDrink) {
                case 1 -> drinks.add(americano);
                case 2 -> drinks.add(latte);
                case 3 -> drinks.add(cappuchino);
                case 4 -> drinks.add(greenTea);
                case 5 -> drinks.add(blackTea);
            }
            System.out.println("Choose one or few drinks: 1 - americano, 2 - latte, 3 - cappuchino, 4 - green tea, 5 - black tea, 6 - finish choosing");
            typeOfDrink = Integer.parseInt(READER.readLine());
        }
        return drinks;
    }
}