package com.andrew.homework.lesson9;

import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {

    public static void main(String[] args) {

        int maxRandomValue = 9;
        int arrayLength = 7;
        ArrayList<Integer> indexesArray = new ArrayList<>();
        int[] lotteryCompanyNumbers = new int[arrayLength];
        int[] customerNumbers = new int[arrayLength];

        fillRandomValuesToArray(lotteryCompanyNumbers, maxRandomValue);
        fillRandomValuesToArray(customerNumbers, maxRandomValue);
        print("First random array is: " + Arrays.toString(lotteryCompanyNumbers));
        print("Second random array is: " + Arrays.toString(customerNumbers));
        Arrays.sort(lotteryCompanyNumbers);
        Arrays.sort(customerNumbers);
        print("First sorted random array is: " + Arrays.toString(lotteryCompanyNumbers));
        print("Second sorted random array is: " + Arrays.toString(customerNumbers));
        int index = checkSameNumbersInArrays(lotteryCompanyNumbers, customerNumbers, indexesArray);
        printIndexes(indexesArray);
        checkArraysContent(indexesArray, index);
    }

    private static void checkArraysContent(ArrayList<Integer> indexesArray, int index) {
        if (indexesArray.isEmpty()){
            print("No matching");
        } else {
            print("Quantity of matching: " + index);
        }
    }

    private static void printIndexes(ArrayList<Integer> indexesArray) {
        for (Integer indexes : indexesArray) {
            System.out.println(indexes);
        }
    }

    private static void fillRandomValuesToArray(int[] lotteryCompanyNumbers, int maxRandomValue) {
        for (int i = 0; i < lotteryCompanyNumbers.length; i++) {
            lotteryCompanyNumbers[i] = (int) (Math.random() * maxRandomValue);
        }
    }

    public static int checkSameNumbersInArrays(int[] lotteryCompanyNumbers, int[] customerNumbers, ArrayList<Integer> indexesArray) {

        int index = 0;
        print("Indexes of equal numbers are: ");
        for (int i = 0; i < lotteryCompanyNumbers.length; i++) {
            if (lotteryCompanyNumbers[i] == customerNumbers[i]) {
                index++;
                indexesArray.add(i);
            }
        }
        return index;
    }

    public static void print(String str) {
        System.out.println(str);
    }

}







