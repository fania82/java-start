package com.andrew.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zeroes {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input length of your array");
        int index = Integer.parseInt(reader.readLine());
        int[] arrayWithZero = new int[index];
        fillArray(arrayWithZero, index, new BufferedReader((new InputStreamReader(System.in))));
        sortArray(arrayWithZero);

    }

    private static void swapArray(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void fillArray(int[] array, int index, BufferedReader reader) throws IOException {
        int counter = 0;
        for (index = 0; index < array.length; index++) {
            counter++;
            System.out.println("Input " + counter + " value for array (add few zeroes)");
            array[index] = Integer.parseInt(reader.readLine());

        }
        System.out.println("Initial array is: " + Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swapArray(array, j, j - 1);
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(array));
    }
}


