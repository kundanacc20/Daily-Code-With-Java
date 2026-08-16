package java8code.day16August2026;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Employee> employeeList = Arrays.asList(
                new Employee(100,"Narayan","Architecture","Male",70000, LocalDate.of(2020, 5, 10),"sambhaji nagar"),
                new Employee(101, "Kundan", "IT", "Male", 75000, LocalDate.of(2020, 6, 10), "Delhi"),
                new Employee(102, "Harshit", "HR", "Male", 55000, LocalDate.of(2021, 3, 15), "Mumbai"),
                new Employee(103, "Abhishek", "Finance", "Male", 68000, LocalDate.of(2019, 9, 20), "Bangalore"),
                new Employee(104, "Devendra", "Marketing", "Male", 60000, LocalDate.of(2018, 12, 5), "Hyderabad"),
                new Employee(105, "Kunal", "Sales", "Male", 72000, LocalDate.of(2022, 2, 25), "Pune"),
                new Employee(106, "Upadhdhya", "Operations", "Male", 50000, LocalDate.of(2017, 5, 30), "Chennai"),
                new Employee(107, "Priya", "IT", "Female", 80000, LocalDate.of(2020, 7, 18), "Delhi"),
                new Employee(108, "Sneha", "HR", "Female", 56000, LocalDate.of(2021, 4, 12), "Mumbai"),
                new Employee(109, "Ravi", "Finance", "Male", 70000, LocalDate.of(2019, 10, 22), "Bangalore"),
                new Employee(110, "Anita", "Marketing", "Female", 62000, LocalDate.of(2018, 11, 8), "Hyderabad"),
                new Employee(111, "Vikas", "Sales", "Male", 74000, LocalDate.of(2022, 3, 28), "Pune"),
                new Employee(112, "Meera", "Operations", "Female", 52000, LocalDate.of(2017, 6, 14), "Chennai"),
                new Employee(113, "Rajesh", "IT", "Male", 77000, LocalDate.of(2020, 8, 19), "Delhi"),
                new Employee(114, "Neha", "HR", "Female", 58000, LocalDate.of(2021, 5, 16), "Mumbai"),
                new Employee(115, "Suresh", "Finance", "Male", 69000, LocalDate.of(2019, 11, 23), "Bangalore"),
                new Employee(116, "Pooja", "Marketing", "Female", 64000, LocalDate.of(2018, 9, 9), "Hyderabad"),
                new Employee(117, "Amit", "Sales", "Male", 76000, LocalDate.of(2022, 4, 29), "Pune"),
                new Employee(118, "Ritika", "Operations", "Female", 54000, LocalDate.of(2017, 7, 15), "Chennai"),
                new Employee(119, "Manish", "IT", "Male", 79000, LocalDate.of(2020, 9, 20), "Delhi"),
                new Employee(120, "Shreya", "HR", "Female", 60000, LocalDate.of(2021, 6, 17), "Mumbai")
        );

//        employeeList.forEach(System.out::println);

        //------------------------------------------------------------------------
//        //Count male and female employees.
//        Map<String,List<Employee>> countOfMaleEmployee = employeeList.stream()
//                .collect(Collectors.groupingBy(employee -> employee.gender()
//        ));
//
//        System.out.println(countOfMaleEmployee);

//        Map<String,Long> finalCountOfMaleFemaleEmployee = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
//        System.out.println(finalCountOfMaleFemaleEmployee);

//        List all departments.

        Set<String> deptList = employeeList.stream()
                .map(employee -> employee.department())
                .collect(Collectors.toSet());
        System.out.println(deptList);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
