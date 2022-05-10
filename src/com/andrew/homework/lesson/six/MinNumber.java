package com.andrew.homework.lesson.six;

public class MinNumber {

    public static void main(String[] args) {

        float randomNumberOne = (float) Math.random();
        float randomNumberTwo = (float) Math.random();
        float randomNumberThree = (float) Math.random();

        System.out.println("The first random number is: " + randomNumberOne);
        System.out.println("The second random number is: " + randomNumberTwo);
        System.out.println("The third random number is: " + randomNumberThree);


        if (randomNumberOne <= randomNumberTwo && randomNumberOne <= randomNumberThree) {
            print("The smallest number is: ", randomNumberOne);
        } else if (randomNumberTwo <= randomNumberOne && randomNumberTwo <= randomNumberThree) {
            print("The smallest number is: ", randomNumberTwo);
        } else {
            print("The smallest number is: ", randomNumberThree);
        }
    }
    public static void print (String str, float random) {
        System.out.println( str + random);
    }


}

