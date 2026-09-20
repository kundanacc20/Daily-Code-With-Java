package com.kundan.day07june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Object object = new Employee("Kundan Kumar",26);

        if(object instanceof Employee(String name, int age)){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time "+ programTime+ " ms");
    }
}
