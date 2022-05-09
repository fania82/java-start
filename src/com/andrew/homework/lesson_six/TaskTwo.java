package com.andrew.homework.lesson_six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskTwo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input any number (use dot as separator): ");
        float firstNumber = Float.parseFloat(reader.readLine());

        System.out.println("input any operation from list: *, /, -, + ");
        String name = reader.readLine();

        System.out.println("input any number(use dot as separator): ");
        float secondNumber = Float.parseFloat(reader.readLine());

        if (name.equals("+")) {
            float sum = useSumOperator(firstNumber, secondNumber);
            System.out.println("The result is: " + sum);
        } else if (name.equals("-")) {
            float deduction = useDeductionOperator(firstNumber, secondNumber);
            System.out.println("The result is: " + deduction);
        } else if (name.equals("*")) {
            float multiply = useMultiplyOperator(firstNumber, secondNumber);
            System.out.println("The result is: " + multiply);
        } else if (name.equals("/")) {
            float divide = useDivideOperator(firstNumber, secondNumber);
            System.out.println("The result is: " + divide);


        }
    }

    public static float useSumOperator(float additionOne, float additionTwo) {
        return additionOne + additionTwo;
    }

    public static float useDeductionOperator(float deductionOne, float deductionTwo) {
        return deductionOne - deductionTwo;
    }

    public static float useMultiplyOperator(float multiplierOne, float multiplierTwo) {
        return multiplierOne * multiplierTwo;
    }

    public static float useDivideOperator(float dividerOne, float dividerTwo) {
        return dividerOne / dividerTwo;
    }


}
