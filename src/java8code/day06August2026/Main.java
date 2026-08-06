package java8code.day06August2026;

import java8code.day05August2026.Employees;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        1. Count Employees Department Wise
        List<Employee> emplst = Arrays.asList(
                new Employee(101,"kundan","developer"),
                new Employee(102,"harshit","marketing"),
                new Employee(103, "abhishek","realstate"),
                new Employee(104,"devendra","talent dept"),
                new Employee(105,"kunal","talent dept"),
                new Employee(106,"upadhdhya","realstate")
        );

        Map<String,List<Employee>> empByDept=
                emplst.stream()
                        .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(empByDept);

        empByDept.forEach((dept, employeeListst) ->{
            System.out.println("department : "+dept);
            employeeListst.forEach(System.out::println);
            System.out.println("-------------------------");

        });
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}
