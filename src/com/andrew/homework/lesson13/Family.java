package com.andrew.homework.lesson13;

public class Family {

    public static void main(String[] args) {
        FamilyMembers child = new FamilyMembers("Nick", 12, true, true);
        System.out.println(child);
        FamilyMembers father = new FamilyMembers ("Kevin", 44, false, false, true);
        System.out.println(father);
        FamilyMembers mother = new FamilyMembers ("Maria", 39, false, true, true);
        System.out.println(mother);
    }

}
