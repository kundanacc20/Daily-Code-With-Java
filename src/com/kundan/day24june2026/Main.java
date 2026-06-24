package com.kundan.day24june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Employee emp = new Employee("john",30,
                new Address("Ahmedabad","gujrat"));

        if(emp instanceof Employee(
                String name,
                int age,
                Address(String city,
                        String state)
        )){
            System.out.println(name);
            System.out.println(age);
            System.out.println(city);
            System.out.println(state);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program Time: "+programTime+" ms");
    }
}
