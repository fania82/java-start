package com.andrew.homework.lesson.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {

    public static void main(String[] args) throws IOException {

        int applesInOneBigJar = 5;
        int applesInOneMiddleJar = 3;
        int applesInOneSmallJar = 1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter how many apples do You collect: ");
        int applesAmount = Integer.parseInt(reader.readLine());
        int applesRemainderAfterFirstFilling = determineDivideRemainder(applesAmount, applesInOneBigJar);
        int applesRemainderAfterSecondFilling = determineDivideRemainder(applesRemainderAfterFirstFilling, applesInOneMiddleJar);


        int fiveLitresJarAmount = fillJars(applesAmount, applesInOneBigJar);
        printResult("Amount of five litres jar is: ", fiveLitresJarAmount);

        int threeLitresJarAmount = fillJars(applesRemainderAfterFirstFilling, applesInOneMiddleJar);
        printResult("Amount of three litres jar is: ", threeLitresJarAmount);

        int oneLitresJarAmount = fillJars(applesRemainderAfterSecondFilling, applesInOneSmallJar);
        printResult("Amount of one litres jar is: ", oneLitresJarAmount);

    }

    public static int determineDivideRemainder(int applesTotalAmount, int applesInOneJar) {

        return applesTotalAmount % applesInOneJar;
    }

    public static int fillJars(int applesTotalAmount, int applesAmount) {

        return applesTotalAmount / applesAmount;
    }

    public static void printResult(String str, int operator) {
        System.out.println(str + operator);
    }
}
