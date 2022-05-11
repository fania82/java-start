package com.andrew.homework.lesson.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        print("input a chemistry evaluation (from 1 to 12): ");
        int chemistryRate = Integer.parseInt(reader.readLine());


        print("input a math evaluation (from 1 to 12): ");
        int mathRate = Integer.parseInt(reader.readLine());

        print("input a physics evaluation (from 1 to 12): ");
        int physicsRate = Integer.parseInt(reader.readLine());

        print("input a literature evaluation (from 1 to 12): ");
        int literatureRate = Integer.parseInt(reader.readLine());

        print("input a programming evaluation (from 1 to 12): ");
        int programmingRate = Integer.parseInt(reader.readLine());

        float examsAverageEvaluation = determineAverageEvaluation(chemistryRate, mathRate, physicsRate, literatureRate, programmingRate);

        System.out.println("The average evaluation is: " + examsAverageEvaluation);


        applyScholarship(examsAverageEvaluation);


    }

    public static float determineAverageEvaluation(float evaluationOne, float evaluationTwo, float evaluationThree, float evaluationFour, float evaluationFive) {
        return (evaluationOne + evaluationTwo + evaluationThree + evaluationFour + evaluationFive) / 5;

    }

    public static void applyScholarship(float examsAverageEvaluation) {
        if (examsAverageEvaluation > 12) {
            print("This number is out of range");
        } else if (examsAverageEvaluation >= 10 && examsAverageEvaluation <= 12) {
            print("Student has increased scholarship");
        } else if (examsAverageEvaluation < 10 && examsAverageEvaluation >= 8) {
            print("Student has usual scholarship");
        } else {
            print("Student doesn't have a scholarship");
        }



    }

    public static void print (String str) {
        System.out.println(str);
    }



}
