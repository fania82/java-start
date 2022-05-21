package com.andrew.homework.lesson8;

import java.util.Arrays;

public class FootballTeam {

    public static void main(String[] args) {

        int teamFirstQuantity[] = new int[11];
        int teamSecondQuantity[] = new int[11];


        for (int i = 0; i < teamFirstQuantity.length; i++) {
            teamFirstQuantity[i] = getRandomInteger(45, 18);
        }
        String firstTeamString = Arrays.toString(teamFirstQuantity);
        print("Ages of the first team players are: " + firstTeamString);

        for (int i = 0; i < teamSecondQuantity.length; i++) {
            teamSecondQuantity[i] = getRandomInteger(45, 18);
        }
        String secondTeamString = Arrays.toString(teamSecondQuantity);
        print("Ages of the second team players are: " + secondTeamString);

        print("");

        int averageFirstTeam = getArrayAverage(teamFirstQuantity);
        printStringAndVariable("The average age of the first team players is: ", averageFirstTeam);

        int averageSecondTeam = getArrayAverage(teamSecondQuantity);
        printStringAndVariable("The average age of the second team players is: ", averageSecondTeam);

        compareAgeAverage(averageFirstTeam, averageSecondTeam);


    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void printStringAndVariable(String str, int variable) {
        System.out.println(str + variable);
    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }

    public static int getArraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int getArrayAverage(int[] array) {
        int sum = getArraySum(array);
        return sum / array.length;
    }

    public static void compareAgeAverage(int averageFirstTeam, int averageSecondTeam) {
        if (averageFirstTeam == averageSecondTeam) {
            print("Average age is equal");
        } else if (averageFirstTeam > averageSecondTeam) {
            print("Average age of the first team players are more than of the second team");
        } else {
            print("Average age of the second team players are more than of the first team");
        }
    }

}
