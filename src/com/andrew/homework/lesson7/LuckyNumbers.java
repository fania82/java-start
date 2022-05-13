package com.andrew.homework.lesson7;

public class LuckyNumbers {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            String luckyNumbers = String.valueOf(i);
            if (!luckyNumbers.contains("4") && !luckyNumbers.contains("9")) {
                System.out.println(luckyNumbers);
            }
        }

    }

}

