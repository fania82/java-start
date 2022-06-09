package com.andrew.homework.lesson13;

public class Person {

    String firstName;
    String lastName;
    int age;
    int height;
    int weight;
    int personCount;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public String toString() {
        return "Person " +  this.personCount + " {" + this.firstName + " " + this.lastName + ", "
                + "Age: " + this.age + " y.o " + ", height = " + this.height + " cm"
                + ", weight = " + this.weight + " kg" + '}';
    }


}
