package com.andrew.homework.lesson13;

public class FamilyMembers {

    String name;
    int age;
    public FamilyMembers father;
    public FamilyMembers mother;

    public FamilyMembers(String name, int age,FamilyMembers father, FamilyMembers mother) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public FamilyMembers() {
    }

    public String toString() {
        String fatherDescripton = this.father !=null? "Father is: " + father : "No father";
        String motherDescripton = this.mother !=null? "Mother is: " + mother : "No mother";

        return "Person {" + this.name + ", " + this.age + " y.o, "
                + fatherDescripton + ", " + motherDescripton + '}';
    }
}