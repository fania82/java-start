package com.andrew.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ABBA {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] initialWord = new String[4];

        int counter = 0;
        for (int i = 0; i < initialWord.length; i++) {
            counter++;
            print("input " + counter + " letter from palindrome with 4 letters (f.e. ABBA)");
            initialWord[i] = reader.readLine();
        }

        String[] copyInitialWord = Arrays.copyOf(initialWord, initialWord.length);
        String copiedInitialWord = Arrays.toString(copyInitialWord);
        System.out.println("Initial word is: " +copiedInitialWord);

        for (int i = 0; i < initialWord.length / 2; i++) {
            String temp = initialWord[i];
            initialWord[i] = initialWord[initialWord.length - i - 1];
            initialWord[initialWord.length - i - 1] = temp;

        }
        String reverseWord = Arrays.toString(initialWord);
        System.out.println("Reverse word is " + reverseWord);

        if (Arrays.equals(initialWord, copyInitialWord)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

    }

    public static void print(String str) {
        System.out.println(str);
    }

}


