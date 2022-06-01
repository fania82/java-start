package com.andrew.homework.lesson11;

import java.util.Random;

public class PasswordMain {

    public static void main(String[] args) {

        StringBuilder randomPassword = new StringBuilder();
        Random random = new Random();
        String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        int capitalLetterCount = 2;
        int numbersCount = 3;
        int lowerCaseLetterCount = 2;

        chooseRandomCharacter(capitalLetterCount, random, capitalLetter, randomPassword);
        randomPassword.append("_");
        chooseRandomCharacter(numbersCount, random, numbers, randomPassword);
        chooseRandomCharacter(lowerCaseLetterCount, random, lowerCaseLetter, randomPassword);

        String generatedPassword = randomPassword.toString();
        System.out.println("Random String is: " + generatedPassword);
    }

    private static void chooseRandomCharacter(int passwordPartLength, Random random, String str, StringBuilder sb) {
        for (int i = 0; i < passwordPartLength; i++) {
            int randomInt = random.nextInt(str.length());
            char randomChar = str.charAt(randomInt);
            sb.append(randomChar);
        }
    }

}



