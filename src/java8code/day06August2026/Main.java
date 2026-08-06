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
                new Employee(101,"kundan","developer",1000000),
                new Employee(102,"harshit","marketing",70000),
                new Employee(103, "abhishek","realstate",90000),
                new Employee(104,"devendra","talent dept",60000),
                new Employee(105,"kunal","talent dept",50000),
                new Employee(106,"upadhdhya","realstate",80000)
        );

//        Map<String,List<Employee>> empByDept=
//                emplst.stream()
//                        .collect(Collectors.groupingBy(Employee::dept));
//        System.out.println(empByDept);
//
//        empByDept.forEach((dept, employeeList) ->{
//            System.out.println("department : "+dept);
//            employeeList.forEach(System.out::println);
//            System.out.println("-------------------------");
//
//        });

        Map<Boolean, List<Employee>> empBySalary = emplst.stream()
                .collect(Collectors.partitioningBy(e ->e.salary()>60000));

        System.out.println("employee who's salary is greater than 60000: "+empBySalary.get(true));
        System.out.println("employee who's salary is less than 60000: "+empBySalary.get(false));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}
