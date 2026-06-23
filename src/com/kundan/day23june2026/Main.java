package com.kundan.day23june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Person person = new Person("Johnn", 25);
//
//        PersonPrinter printer = new PersonPrinter();
//        printer.printPerson(person);

        //Using Record Patterns

        Object obj = new Person("John", 25);

        if(obj instanceof Person(String name,int age)){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
