package com.andrew.homework.lesson_three;

public class TaskOne {

    public static void main(String[] args) {

        float radius1 = 1f;
        float radius2 = 0.5f;
        float radius3 = 0.2f;
        float density = 0.7f;

        float volume1 = (float) (4 * (Math.PI) * (Math.pow(radius1, 3))) / 3;
        float volume2 = (float) (4 * (Math.PI) * (Math.pow(radius2, 3))) / 3;
        float volume3 = (float) (4 * (Math.PI) * (Math.pow(radius3, 3))) / 3;

        float totalWeight = (volume1 + volume2 + volume3) * density;

//        this is for question
//        float totalWeight1 = volume1 * density;
//        float totalWeight2 = volume2 * density;
//        float totalWeight3 = volume3 * density;
//        float total = totalWeight1 + totalWeight2 + totalWeight3;
//        System.out.println(total);

        System.out.println("Total Snowman weight is:" + totalWeight);

    }


}
