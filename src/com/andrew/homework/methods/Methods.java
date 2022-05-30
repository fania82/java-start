package com.andrew.homework.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    private static void fillArray(int[][] arrayWithNegativeNumbers) throws IOException {
        for (int i = 0; i < arrayWithNegativeNumbers.length; i++) {

            for (int j = 0; j < arrayWithNegativeNumbers[i].length; j++) {
                System.out.print("Input matrix row " + i + " element no: " + j + " : ");
                arrayWithNegativeNumbers[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }
}
