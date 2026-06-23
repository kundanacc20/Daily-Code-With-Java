package com.kundan.day23june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Person person = new Person("Johnn", 25);

        PersonPrinter printer = new PersonPrinter();
        printer.printPerson(person);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
