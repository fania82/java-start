package com.andrew.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativeValues {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input how many lows will be in array");
        int rows = Integer.parseInt(READER.readLine());
        System.out.println("Input how many columns will be in array");
        int columns = Integer.parseInt(READER.readLine());
        int[][] arrayWithNegativeNumbers = new int[rows][columns];


        fillArray(arrayWithNegativeNumbers);

        findNegativeValue(arrayWithNegativeNumbers);

    }

    private static void fillArray(int[][] arrayWithNegativeNumbers) throws IOException {
        for (int i = 0; i < arrayWithNegativeNumbers.length; i++) {

            for (int j = 0; j < arrayWithNegativeNumbers[i].length; j++) {
                System.out.print("Input matrix row " + i + " element no: " + j + " : ");
                arrayWithNegativeNumbers[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }

    private static void findNegativeValue(int[][] arrayWithNegativeNumbers) {
        for (int i = 0; i < arrayWithNegativeNumbers.length; i++) {

            for (int j = 0; j < arrayWithNegativeNumbers[i].length; j++) {
                if (arrayWithNegativeNumbers[i][j] < 0) {
                    System.out.println("Negative values are located (row, column): " + i + "," + j);

                }
            }

        }
    }


}