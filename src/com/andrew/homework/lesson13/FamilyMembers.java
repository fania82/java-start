package com.andrew.homework.lesson13;

public class FamilyMembers {

    String name;
    int age;
    boolean father;
    boolean mother;
    boolean child;

    public FamilyMembers(String name, int age, boolean father, boolean mother) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;

    }
    public FamilyMembers(String name, int age, boolean father, boolean mother, boolean child) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.child = child;
    }

    public String toString() {
        return "Person {" + this.name + ", " + this.age + " y.o, "
                + "Father is: " + (this.father? "Present" : "Not present") + ", " + "Mother is: "
                + (this.mother? "Present" : "Not present") + ", " + "Child is: " + (this.child? "Present" : "Not present") + '}';
    }

}