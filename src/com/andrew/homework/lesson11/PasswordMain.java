package com.andrew.homework.lesson11;

import java.time.DayOfWeek;
import java.time.LocalDate;
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
        int lowerCaseLetterCount = 3;

        getDayOfWeek();
        generateRandomPassword(randomPassword, random, capitalLetter, lowerCaseLetter, numbers, capitalLetterCount, numbersCount, lowerCaseLetterCount);

    }
    private static void generateRandomPassword(StringBuilder randomPassword, Random random, String capitalLetter, String lowerCaseLetter, String numbers, int capitalLetterCount, int numbersCount, int lowerCaseLetterCount) {
        switch (getDayOfWeek()) {

            case SUNDAY, MONDAY:
                randomPassword.append("_");
                chooseRandomCharacter(numbersCount, random, numbers, randomPassword);
                chooseRandomCharacter(lowerCaseLetterCount, random, lowerCaseLetter, randomPassword);
                chooseRandomCharacter(capitalLetterCount, random, capitalLetter, randomPassword);
                String generatedPassword = randomPassword.toString();
                System.out.println("Random String is: " + generatedPassword);
                break;
            case TUESDAY, WEDNESDAY, THURSDAY:
                chooseRandomCharacter(lowerCaseLetterCount, random, lowerCaseLetter, randomPassword);
                randomPassword.append("_");
                chooseRandomCharacter(capitalLetterCount, random, capitalLetter, randomPassword);
                chooseRandomCharacter(numbersCount, random, numbers, randomPassword);
                String generatedPassword2 = randomPassword.toString();
                System.out.println("Random String is: " + generatedPassword2);
                break;

            case FRIDAY, SATURDAY:
                chooseRandomCharacter(capitalLetterCount, random, capitalLetter, randomPassword);
                chooseRandomCharacter(numbersCount, random, numbers, randomPassword);
                chooseRandomCharacter(lowerCaseLetterCount, random, lowerCaseLetter, randomPassword);
                randomPassword.append("_");
                String generatedPassword1 = randomPassword.toString();
                System.out.println("Random String is: " + generatedPassword1);
                break;
        }

    }

    private static DayOfWeek getDayOfWeek() {
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek;
    }

    private static void chooseRandomCharacter(int passwordPartLength, Random random, String str, StringBuilder sb) {
        for (int i = 0; i < passwordPartLength; i++) {
            int randomInt = random.nextInt(str.length());
            char randomChar = str.charAt(randomInt);
            sb.append(randomChar);
        }
    }
}



