package com.andrew.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarsWashingFor {

    public static void main(String[] args) throws IOException, InterruptedException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        printMessage("Enter how many cars will be washed");
        int cars = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= cars; i++) {
            printMessage("number of car: " + i);
            Thread.sleep(2500);
            applySoapForCars();
            washCars();
            dryUpCars();


        }
        printMessage("All cars are clean!");


    }


    public static void applySoapForCars() throws InterruptedException {
        printMessage("car is soaping");
        Thread.sleep(2500);

    }

    public static void washCars() throws InterruptedException {
        printMessage("car is washing");
        Thread.sleep(2500);

    }

    public static void dryUpCars() throws InterruptedException {
        printMessage("car is drying up");
        Thread.sleep(2500);

    }

    public static void printMessage(String str) {
        System.out.println(str);
    }



}
