package com.andrew.homework.lesson.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaggageApproving {

    public static void main(String[] args) throws IOException {

        int horizontalHeight = 40;
        int verticalHeight = 53;
        int horizontalLength = 55;
        int verticalLength = 40;
        int horizontalDepth = 20;
        int verticalDepth = 22;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Do You have horizontal bag (type true if yes and false if not): ");
        boolean typeOfBaggage = Boolean.parseBoolean(reader.readLine());

        System.out.println("input height of Your bag (in cm): ");
        int baggageHeight = Integer.parseInt(reader.readLine());

        System.out.println("input length of Your bag (in cm): ");
        int baggageLength = Integer.parseInt(reader.readLine());

        System.out.println("input depth of Your bag (in cm): ");
        int baggageDepth = Integer.parseInt(reader.readLine());

        if (typeOfBaggage) {
            checkBaggage(baggageHeight, baggageLength, baggageDepth, horizontalHeight, horizontalLength, horizontalDepth);
        } else {
            checkBaggage(baggageHeight, baggageLength, baggageDepth, verticalHeight, verticalLength, verticalDepth);
        }


    }

    public static void checkBaggage(int baggageHeight, int baggageLength, int baggageDepth, int height, int length, int depth) {
        if (baggageHeight > height && baggageLength > length && baggageDepth > depth) {
            System.out.println("Baggage isn't confirmed, height, length and depth are more than allowed");
        } else if (baggageHeight > height && baggageLength > length) {
            System.out.println("Baggage isn't confirmed, height and length are more than allowed");
        } else if (baggageHeight > height && baggageDepth > depth) {
            System.out.println("Baggage isn't confirmed, height and depth are more than allowed");
        } else if (baggageLength > length && baggageDepth > depth) {
            System.out.println("Baggage isn't confirmed, length and depth are more than allowed");
        } else if (baggageHeight > height) {
            System.out.println("Baggage isn't confirmed, height is more than allowed");
        } else if (baggageLength > length) {
            System.out.println("Baggage isn't confirmed, length is more than allowed");
        } else if (baggageDepth > depth) {
            System.out.println("Baggage isn't confirmed, depth is more than allowed");
        } else {
            System.out.println("Baggage is confirmed");
        }

    }


}
