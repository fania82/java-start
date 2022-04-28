package com.andrew.homework.lesson_two;

public class TaskOne {


    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        System.out.println("variable a:" + a);
        System.out.println("variable b:" + b);

        byte c = a;
        a = b;
        b = c;

        System.out.println("variable a:" + a);
        System.out.println("variable b:" + b);


    }
}



