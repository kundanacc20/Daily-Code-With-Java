package com.kundan.day23june2026;

public class PersonPrinter {
    public void printPerson(Person person){
        String name = person.name();
        int age = person.age();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
