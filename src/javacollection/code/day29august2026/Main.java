package javacollection.code.day29august2026;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Kundan", 75000),
                new Employee(102, "Harshit", 55000),
                new Employee(103, "Abhishek", 68000),
                new Employee(104, "Devendra", 60000),
                new Employee(105, "Kunal", 72000),
                new Employee(106, "Priya", 80000),
                new Employee(107, "Sneha", 56000),
                new Employee(108, "Ravi", 70000),
                new Employee(109, "Anita", 62000),
                new Employee(110, "Vikas", 74000),
                new Employee(111, "Meera", 52000),
                new Employee(112, "Rajesh", 77000),
                new Employee(113, "Neha", 58000),
                new Employee(114, "Suresh", 69000),
                new Employee(115, "Pooja", 64000),
                new Employee(116, "Amit", 76000),
                new Employee(117, "Ritika", 54000),
                new Employee(118, "Manish", 79000),
                new Employee(119, "Shreya", 60000),
                new Employee(120, "Narayan", 70000)
        );

       // System.out.println(employees);


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
