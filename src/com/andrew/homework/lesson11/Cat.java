package com.andrew.homework.lesson11;

public class Cat {

    String name;
    int age;
    int height;
    String breed;

    public Cat() {
        System.out.println("cat is putted to scales");
    }

    public Cat(String name, int age, int height, String breed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }

    public Cat(int age, int height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Cat cat) {

            return this.age == cat.age && this.height == cat.height;
        }
        return false;
    }

    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", height=" + this.height +
                ", breed='" + this.breed + '\'' +
                '}';

    }
}