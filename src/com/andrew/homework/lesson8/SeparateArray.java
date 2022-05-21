package com.andrew.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SeparateArray {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int bigArray[] = new int[20];
        int[] smallArrayFirst = new int[10];
        int[] smallArraySecond = new int[10];

        int counter = 0;
        for (int i = 0; i < bigArray.length; i++) {
            counter++;
            System.out.println("Input " + counter + " value for array");
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        System.arraycopy(bigArray, 0, smallArrayFirst, 0, 10);
        String firstArrayString = Arrays.toString(smallArrayFirst);
        System.out.println("First array is " + firstArrayString);

        System.arraycopy(bigArray, 10, smallArraySecond, 0, 10);
        String secondArrayString = Arrays.toString(smallArraySecond);
        System.out.println("Second array is " + secondArrayString);

    }


}