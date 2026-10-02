package java8code.day02October2026;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Employee> emplist = Arrays.asList(
                new Employee(1,"kundan","dev",27,50000,"male"),
                new Employee(2,"narayan","architect",20,50000,"male"),
                new Employee(3,"Harsht","NewReporter",29,60000,"male"),
                new Employee(4,"komal","QA",28,40000,"female"),
                new Employee(5,"aditya","software Engineer",28,45000,"male"),
                new Employee(6,"Arunima","dev",28,100000,"female"),
                new Employee(7,"Anee","sofware dev",28,100001,"female"),
                new Employee(8,"shruti","dentist",28,50000,"female")
        );

        /*Map<String,Long> maleAndFemaleCount = emplist.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()
                ));

                System.out.println(maleAndFemaleCount);
         */

        /* List<Employee> empWithSalaryWithAbove50000 = emplist.stream()
                        .filter(e -> e.salary()>=50000)
                                .collect(Collectors.toList());

        empWithSalaryWithAbove50000.forEach(System.out::println);

         */
//employee with second highest salary
        Optional<Employee> secondHighestSalary = emplist.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .skip(1)
                .findFirst();

        secondHighestSalary.ifPresent(System.out::println);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
