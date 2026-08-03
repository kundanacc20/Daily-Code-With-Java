package java8code.day03August2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        1. Find Highest Salary Employee
        List<Employee> emplist = Arrays.asList(new Employee(1,"kundan",1000000),
                new Employee(2,"harshit singh",100000),
                new Employee(3,"narayan",100000),
                new Employee(4,"vivek chaurasiya",100000));

        Employee maxSalary = emplist.stream().max(Comparator.comparingLong(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employee found"));
        System.out.println(maxSalary);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
