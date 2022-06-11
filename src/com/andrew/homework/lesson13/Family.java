package com.andrew.homework.lesson13;

public class Family {

    public static void main(String[] args) {

        FamilyMembers father = new FamilyMembers();
        father.name = "Alex";
        father.age = 56;
        System.out.println(father);

        FamilyMembers mother = new FamilyMembers();
        mother.name = "Cristina";
        mother.age = 47;
        System.out.println(father);

        FamilyMembers child = new FamilyMembers();
        child.name = "Nick";
        child.age = 18;
        child.father = father;
        child.mother = mother;
        System.out.println(child);
    }
}
