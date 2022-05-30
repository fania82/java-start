package com.andrew.homework.lesson10;

import com.andrew.homework.methods.Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        printMessage("Input how many lows will be in array: ");
        int matrixSide = Integer.parseInt(READER.readLine());
        int[][] arrayWithNegativeNumbers = new int[matrixSide][matrixSide];

        fillArray(arrayWithNegativeNumbers);
        System.out.println("Original matrix is: ");
        printArray(matrixSide, arrayWithNegativeNumbers);

        System.out.println("Transported matrix is: ");

        changeMatrix(matrixSide, arrayWithNegativeNumbers);
        printArray(matrixSide, arrayWithNegativeNumbers);

    }

    private static void changeMatrix(int rows, int[][] arrayWithNegativeNumbers) {
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                int temp = arrayWithNegativeNumbers[i][j];
                arrayWithNegativeNumbers[i][j] = arrayWithNegativeNumbers[j][i];
                arrayWithNegativeNumbers[j][i] = temp;

            }
        }
    }

    private static void printArray(int rows, int[][] arrayWithNegativeNumbers) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arrayWithNegativeNumbers[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillArray(int[][] arrayWithNegativeNumbers) throws IOException {
        for (int i = 0; i < arrayWithNegativeNumbers.length; i++) {

            for (int j = 0; j < arrayWithNegativeNumbers[i].length; j++) {
                printMessage("Input matrix row " + i + " element no: " + j + " : ");
                arrayWithNegativeNumbers[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }

    private static void printMessage(String str) {
        System.out.print(str);
    }

}
