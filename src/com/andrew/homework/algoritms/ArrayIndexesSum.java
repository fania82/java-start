package com.andrew.homework.algoritms;

public class ArrayIndexesSum {

    public static void main(String[] args) {

        int[] initialArray = {1, 2, 3, 4, 5};
        int sum = 5;

        foundIndexes(initialArray, sum);

    }

    private static void foundIndexes(int[] initialArray, int sum) {
        for (int i = 0; i < (initialArray.length - 1); i++) {
            int nextIndex = i + 1;
            int temp = initialArray[i];
            int temp1 = initialArray[nextIndex];
            int indexSum = temp + temp1;
            if (indexSum == sum) {
                System.out.println("First index is: " + i + " Second index is: " + nextIndex);
            }

        }
    }
}
