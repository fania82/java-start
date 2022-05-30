package com.andrew.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int minNumber = 0;
        int maxNumber = 10000;

        int numberForFactorial = readNumber(minNumber, maxNumber);
        BigInteger factorial = factorial(numberForFactorial);
        System.out.println("Factorial is: " + factorial);
    }

    public static BigInteger factorial(int number) {
        if (number <= 1)
            return BigInteger.ONE;
        else
            return factorial(number - 1).multiply(BigInteger.valueOf(number));
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number (from 0 to 10000):");
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("input must be in range from " + min + " to " + max);
                return readNumber(min, max);
            }
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber(min, max);
        }
    }
}
