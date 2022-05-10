package com.andrew.homework.lesson.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        inputData("input any number (use dot as separator): ");
        float firstNumber = Float.parseFloat(reader.readLine());

        inputData("input any operator from list: *, /, -, + ");
        String operator = reader.readLine();

        inputData("input any number(use dot as separator): ");
        float secondNumber = Float.parseFloat(reader.readLine());


        switch (operator) {
            case "+":
                float sum = useSumOperator(firstNumber, secondNumber);
                printResult(sum);
                break;
            case "-":
                float deduction = useDeductionOperator(firstNumber, secondNumber);
                printResult(deduction);
                break;
            case "*":
                float multiply = useMultiplyOperator(firstNumber, secondNumber);
                printResult(multiply);
                break;
            case "/":
                float divide = useDivideOperator(firstNumber, secondNumber);
                printResult(divide);
                break;
            default:
                System.out.println("Not correct operator");

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

    public static void printResult(float operator) {
        System.out.println("The result is: " + operator);
    }

    public static void inputData(String str) {
        System.out.println(str);
    }


}
