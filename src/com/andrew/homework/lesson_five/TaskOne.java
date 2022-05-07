package com.andrew.homework.lesson_five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input a exam1 evaluation (from 1 to 12): ");
        int exam1Evaluation = Integer.parseInt(reader.readLine());

        System.out.println("input a exam2 evaluation (from 1 to 12): ");
        int exam2Evaluation = Integer.parseInt(reader.readLine());

        System.out.println("input a exam3 evaluation (from 1 to 12): ");
        int exam3Evaluation = Integer.parseInt(reader.readLine());

        System.out.println("input a exam4 evaluation (from 1 to 12): ");
        int exam4Evaluation = Integer.parseInt(reader.readLine());

        System.out.println("input a exam5 evaluation (from 1 to 12): ");
        int exam5Evaluation = Integer.parseInt(reader.readLine());

        float examsAverageEvaluation = averageEvaluation(exam1Evaluation, exam2Evaluation, exam3Evaluation, exam4Evaluation, exam5Evaluation);

        System.out.println("The average evaluation is: " + examsAverageEvaluation);

        scholarship(examsAverageEvaluation);


    }

    public static float averageEvaluation(float evaluation1, float evaluation2, float evaluation3, float evaluation4, float evaluation5) {
        return (evaluation1 + evaluation2 + evaluation3 + evaluation4 + evaluation5) / 5;

    }

    public static void scholarship(float examsAverageEvaluation) {
        if (examsAverageEvaluation >= 10) {
            System.out.println("Student has increased scholarship");
        } else if (examsAverageEvaluation < 10 && examsAverageEvaluation >= 8) {
            System.out.println("Student has usual scholarship");
        } else {
            System.out.println("Student doesn't have a scholarship");
        }


    }

}
