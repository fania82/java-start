package com.andrew.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessAnswer {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int randomNumber = getRandomInteger(10, 0);

        printString("Try to guess number. Input any number from 0 to 10");
        int input = Integer.parseInt(reader.readLine());


        while (input != randomNumber) {

            printString("Not guessed. Try one more time. Input number");
            input = Integer.parseInt(reader.readLine());
        }
        printStringAndVariable("Congratulation!!! Random number was: ", randomNumber);


    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }

    public static void printString(String str) {
        System.out.println(str);
    }

    public static void printStringAndVariable(String str, int number) {
        System.out.println(str + number);
    }

}
