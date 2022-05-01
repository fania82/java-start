package com.andrew.homework.lesson.four;

public class TaskOne {

    public static void main(String[] args) {


        printAirplaneInfo("F-22 Raptor", "Jet");
        printAirplaneInfo("Aerobus 737", "Airlines", 120);
        printAirplaneInfo("Boeing 777", "Airlines", 180, 28);


    }

    public static void printAirplaneInfo(String planeName, String planeType) {
        System.out.println("Plane Type is:" + planeType + ", " + "Plane Name is:" + planeName);

    }

    public static void printAirplaneInfo(String planeName, String planeType, int planeEconomSeats) {
        System.out.println("Plane Type is:" + planeType + ", " + "Plane Name is:" + planeName + ", " + "Count of Econom seats is:" + planeEconomSeats);

    }

    public static void printAirplaneInfo(String planeName, String planeType, int planeEconomSeats, int planeBusinessSeats) {
        System.out.println("Plane Type is:" + planeType + ", " + "Plane Name is:" + planeName + ", " + "Count of Econom seats is:" + planeEconomSeats + ", " + "Count of Business seats is:" + planeBusinessSeats);

    }
}
