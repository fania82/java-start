package com.andrew.homework.algoritms;

import java.util.Arrays;

public class ArrayDislocation {

    public static void main(String[] args) {

        int[] originalArray = {1,2,3,4,5};
        int[] dislocationArray = new int[5];
        System.arraycopy(originalArray, 3, dislocationArray, 0, 2);
        System.arraycopy(originalArray, 0, dislocationArray, 2, 3);
        String dislocationString = Arrays.toString(dislocationArray);
        System.out.println("Dislocation array is " + dislocationString);
    }
}
