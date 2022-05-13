package com.andrew.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarsWashingWhile {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        printMessage("Enter how many cars will be washed");
        int cars = Integer.parseInt(reader.readLine());

        int i = 0;

        while (i <= cars) {
            if (cars != 0) {
                applySoapForCars("car " + cars + " is soaping");
                washCars("car " + cars + " is washing");
                dryUpCars("car " + cars + " is drying up");
                cars--;
            }
            i--;

        }
        System.out.println("All cars are clean!");

    }

    public static void applySoapForCars(String str) throws InterruptedException {
        printMessage(str);
        Thread.sleep(2500);

    }

    public static void washCars(String str) throws InterruptedException {
        printMessage(str);
        Thread.sleep(2500);

    }

    public static void dryUpCars(String str) throws InterruptedException {
        printMessage(str);
        Thread.sleep(2500);

    }
    public static void printMessage(String str) {
        System.out.println(str);
    }

}
