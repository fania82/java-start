package com.andrew.homework.lesson.four;

public class TaskTwo {

    public static void main(String[] args) {
        int cats = 8;
        int dogs = 24;
        int onePortion = 50;
        int cost = 2;
        int feedPerDay = 3;
        int days = 30;
        int gramInOneKg = 1000;

        int resultCatsMonthlyFood = countMonthlyFood(onePortion, feedPerDay, days, cats, gramInOneKg);
        System.out.println("Total monthly cats food = " + resultCatsMonthlyFood + " Kg");

        int resultDogsMonthlyFood = countMonthlyFood(onePortion, feedPerDay, days, dogs, gramInOneKg);
        System.out.println("Total monthly dogs food = " + resultDogsMonthlyFood + " Kg");

        int monthlyTotalCost = totalCost(feedPerDay, days, cats, cost) + totalCost(feedPerDay, days, dogs, cost);
        System.out.println("Total cost for food = " + monthlyTotalCost + " USD");

    }

    public static int countMonthlyFood(int portion, int feedPerDay, int days, int animals, int gramInOneKg) {

        return (portion * feedPerDay * days * animals) / gramInOneKg;
    }

    public static int totalCost(int feedPerDay, int days, int animals, int cost) {

        return feedPerDay * days * animals * cost;
    }


}
