package com.andrew.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrix {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        printMessage("Input how many rows will be in array: ");
        int rows = Integer.parseInt(READER.readLine());
        printMessage("Input how many columns will be in array: ");
        int columns = Integer.parseInt(READER.readLine());
        int[][] originMatrix = new int[rows][columns];
        int[][] transpondeMatrix = new int[columns][rows];

        fillArray(originMatrix);
        printMessage("Original matrix is: ");
        printArray(originMatrix);

        printMessage("Transported matrix is: ");

        changeMatrix(originMatrix, transpondeMatrix);
        printArray(transpondeMatrix);

    }

    private static void changeMatrix(int[][] array, int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array[j][i];

            }
        }
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillArray(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                printMessage("Input matrix row " + i + " element no: " + j + " : ");
                array[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }

    private static void printMessage(String str) {
        System.out.print(str);
    }

}

