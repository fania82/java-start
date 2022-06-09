package com.andrew.homework.lesson13;

import java.util.ArrayList;

public class PersonMain {

    public static void main(String[] args) {
        String[] personFirstName = {"Luk", "Lora", "Tom", "Roxane", "Brad", "Bruce", "Merylyn", "Sol", "Kate"};
        String[] personLastName = {"Pitt", "Swift", "Imbruglia", "Iglesias", "Lee", "Tarantino", "Belucci", "Ronaldo"};
        int countOfPersons = 101;
        ArrayList<Person> persons = createPerson(personFirstName, personLastName, countOfPersons);
        printArrayList(persons);
    }

    private static ArrayList<Person> createPerson(String[] personFirstName, String[] personLastName, int count) {
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 1; i < count ; i++) {
            int index, index1, minWeight, maxWeight, minHeight, maxHeight;
            index = (int) (Math.random() * personFirstName.length);
            index1 = (int) (Math.random() * personLastName.length);
            Person person = new Person();
            person.personCount = i;
            person.firstName = personFirstName[index];
            person.lastName = personLastName[index1];
            person.age = getRandomInteger(100, 1);
            if (person.age <= 12) {
                minWeight = 8;
                maxWeight = 60;
                minHeight = 50;
                maxHeight = 160;
            } else if (person.age <= 25) {
                minWeight = 40;
                maxWeight = 130;
                minHeight = 120;
                maxHeight = 200;
            } else if (person.age <= 60) {
                minWeight = 45;
                maxWeight = 130;
                minHeight = 140;
                maxHeight = 200;
            } else {
                minWeight = 45;
                maxWeight = 130;
                minHeight = 140;
                maxHeight = 180;
            }
            person.height = getRandomInteger(maxHeight, minHeight);
            person.weight = getRandomInteger(maxWeight, minWeight);
            persons.add(person);
        }
        return persons;
    }

    public static void printArrayList(ArrayList<Person> persons) {
        for (Person person: persons) {
            System.out.println(person);
        }
    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
}