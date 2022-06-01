package com.andrew.homework.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatsMain {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.print("Input the first cat height: ");
        int cat1Height = Integer.parseInt(READER.readLine());
        System.out.print("Input the first cat age: ");
        int cat1Age = Integer.parseInt(READER.readLine());

        System.out.print("Input the second cat height: ");
        int cat2Height = Integer.parseInt(READER.readLine());
        System.out.print("Input the second cat age: ");
        int cat2Age = Integer.parseInt(READER.readLine());

        Cat cat1 = new Cat(cat1Height, cat1Age);
        Cat cat2 = new Cat(cat2Height, cat2Age);

//        System.out.println(cat1); for question!!!

        compareCats(cat1, cat2);

        Cat cat3 = new Cat("Snowie", 12, 22, "British");
        System.out.println(cat3);
    }

    private static void compareCats(Cat cat1, Cat cat2) {
        boolean result = cat1.equals(cat2);
        if (result) {
            System.out.println("Cats are equal");
        } else {
            System.out.println("Cats are different");
        }
    }

}

