package java8code.day03August2026;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        1. Find Highest Salary Employee
        List<Employee> emplist = Arrays.asList(new Employee(1,"kundan",1000000),
                new Employee(2,"harshit singh",100006),
                new Employee(3,"narayan",100005),
                new Employee(4,"vivek chaurasiya",100009));

//        Employee maxSalary = emplist.stream().max(Comparator.comparingLong(Employee::getSalary))
//                .orElseThrow(() -> new RuntimeException("No employee found"));
//        System.out.println(maxSalary);

//        2. Find Second Highest Salary

        Optional<Employee> secondHighestSalary = emplist.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .skip(1).findFirst();

        System.out.println(secondHighestSalary);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
