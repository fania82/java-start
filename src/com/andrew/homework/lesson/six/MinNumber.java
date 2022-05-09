package com.andrew.homework.lesson.six;

public class MinNumber {

    public static void main(String[] args) {

        float random1 = (float) Math.random();
        float random2 = (float) Math.random();
        float random3 = (float) Math.random();

        System.out.println("The first random number is: " + random1);
        System.out.println("The second random number is: " + random2);
        System.out.println("The third random number is: " + random3);


        if (random1 <= random2 && random1 <= random3) {
            System.out.println("The smallest number is: " + random1);
        } else if (random2 <= random1 && random2 <= random3) {
            System.out.println("The smallest number is: " + random2);
        } else {
            System.out.println("The smallest number is: " + random3);
        }
    }


}

