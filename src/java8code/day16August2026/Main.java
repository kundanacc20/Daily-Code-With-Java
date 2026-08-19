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
                new Employee(100,"Narayan", 35,"Architecture","Male",70000, LocalDate.of(2020, 5, 10),"sambhaji nagar"),
                new Employee(101, "Kundan", 27,"IT", "Male", 75000, LocalDate.of(2020, 6, 10), "Delhi"),
                new Employee(102, "Harshit", 28,"HR", "Male", 55000, LocalDate.of(2021, 3, 15), "Mumbai"),
                new Employee(103, "Abhishek", 32,"Finance", "Male", 68000, LocalDate.of(2019, 9, 20), "Bangalore"),
                new Employee(104, "Devendra", 29,"Marketing", "Male", 60000, LocalDate.of(2018, 12, 5), "Hyderabad"),
                new Employee(105, "Kunal", 31,"Sales", "Male", 72000, LocalDate.of(2022, 2, 25), "Pune"),
                new Employee(106, "Upadhdhya", 40,"Operations", "Male", 50000, LocalDate.of(2017, 5, 30), "Chennai"),
                new Employee(107, "Priya", 27,"IT", "Female", 80000, LocalDate.of(2020, 7, 18), "Delhi"),
                new Employee(108, "Sneha", 26,"HR", "Female", 56000, LocalDate.of(2021, 4, 12), "Mumbai"),
                new Employee(109, "Ravi", 34,"Finance", "Male", 70000, LocalDate.of(2019, 10, 22), "Bangalore"),
                new Employee(110, "Anita", 33,"Marketing", "Female", 62000, LocalDate.of(2018, 11, 8), "Hyderabad"),
                new Employee(111, "Vikas", 29,"Sales", "Male", 74000, LocalDate.of(2022, 3, 28), "Pune"),
                new Employee(112, "Meera", 36,"Operations", "Female", 52000, LocalDate.of(2017, 6, 14), "Chennai"),
                new Employee(113, "Rajesh", 31,"IT", "Male", 77000, LocalDate.of(2020, 8, 19), "Delhi"),
                new Employee(114, "Neha", 28,"HR", "Female", 58000, LocalDate.of(2021, 5, 16), "Mumbai"),
                new Employee(115, "Suresh", 35,"Finance", "Male", 69000, LocalDate.of(2019, 11, 23), "Bangalore"),
                new Employee(116, "Pooja", 30,"Marketing", "Female", 64000, LocalDate.of(2018, 9, 9), "Hyderabad"),
                new Employee(117, "Amit", 32,"Sales", "Male", 76000, LocalDate.of(2022, 4, 29), "Pune"),
                new Employee(118, "Ritika", 27,"Operations", "Female", 54000, LocalDate.of(2017, 7, 15), "Chennai"),
                new Employee(119, "Manish", 33,"IT", "Male", 79000, LocalDate.of(2020, 9, 20), "Delhi"),
                new Employee(120, "Shreya", 25,"HR", "Female", 60000, LocalDate.of(2021, 6, 17), "Mumbai")
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

////        List all departments.
//
//        Set<String> deptList = employeeList.stream()
//                .map(employee -> employee.department())
//                .collect(Collectors.toSet());
//        System.out.println(deptList);

//        List<String> deptList = employeeList.stream()
//                .map(Employee::department)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(deptList);

//        //Count employees in each department.
//
//        Map<String,Long> empInEachDept = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
//
////        System.out.println(empInEachDept);
//        empInEachDept.forEach((dept, count)->
//                System.out.println("Department: "+dept+" | count : "+count));

////        Find average age.
//        double  avgAge = employeeList.stream()
//                .mapToInt(Employee::age)
//                .average()
//                        .orElse(0);
//        System.out.println(avgAge);

////        Find average age by gender.
//        Map<String, Double> avgAge = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::gender, Collectors.averagingInt(Employee::age)));
//
////        System.out.println(avgAge);
//
//        avgAge.forEach((department, averageAge)->
//                System.out.println("Department: "+department+ " | average age: "+averageAge));

//        Find highest-paid employee.
//        Optional<Employee> highestPaidEmployee = employeeList.stream()
//                .max(Comparator.comparing(Employee::salary));
//
//
//        System.out.println(highestPaidEmployee.get().name());

//        Employee highestPaid = employeeList.stream()
//                .max(Comparator.comparingDouble(Employee::salary))
//                .orElseThrow(()->new RuntimeException("no such employee found"));
//
//        System.out.println(highestPaid.name());

//        Employee highestPaidEmp = employeeList.stream()
//                .reduce((emp1,emp2)->emp1.salary()>emp2.salary() ? emp1:emp2)
//                .orElseThrow(()->new RuntimeException("No employee found"));
//
//        System.out.println(highestPaidEmp.name());

////        Find lowest-paid employee.
//        Employee lowestPaidEmp = employeeList.stream()
//                .min(Comparator.comparing(Employee::salary))
//                .orElseThrow(()->new RuntimeException("no such employee found"));
//
//        System.out.println(lowestPaidEmp.name());
//
//        Employee lowestPaidEmployee = employeeList.stream()
//                .reduce((emp1, emp2) -> emp1.salary() < emp2.salary() ? emp1:emp2)
//                .orElseThrow(() -> new RuntimeException("no such employee found"));
//        System.out.println("lowest paid employee: "+lowestPaidEmployee.name()+" ji");

////        Find average salary.
//        Double avgSalary = employeeList.stream()
//                .collect(Collectors.averagingLong(Employee::salary));
//        System.out.println(avgSalary);


//        //find Average salary by department
//        Map<String, Double> avgSalaryByDept = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::department,Collectors.averagingDouble(Employee::salary)));
//
////        System.out.println(avgSalaryByDept);
//        avgSalaryByDept.forEach((dept, avgSalary) ->
//                System.out.println("Department: "+dept+" | avgerage salary: "+avgSalary));

////        Find employees who joined after 2020.
//        List<Employee> empJoinedAfter2020 = employeeList.stream()
//                .filter(e->e.joiningDate().isAfter(LocalDate.of(2020,1,1)))
//                .toList();
//
//        // i want only names of employee
//        List<String> namesOfEmpWhoJoinedAfter2020 = employeeList.stream()
//                .filter(emp -> emp.joiningDate().isAfter(LocalDate.of(2020,1,1)))
//                        .map(Employee::name)
//                                .toList();
////        empJoinedAfter2020.forEach(System.out::println);
//        System.out.println(namesOfEmpWhoJoinedAfter2020);

////        Find the oldest employee.
//        Optional<Employee> oldestEmployee = employeeList.stream()
//                .min(Comparator.comparing(emp -> emp.joiningDate()));
//
//        System.out.println(oldestEmployee);

//        // find the youngest employee
//
//        Optional<Employee> youngestEmployee = employeeList.stream()
//                .max(Comparator.comparing(Employee::joiningDate));
//
//        System.out.println(youngestEmployee);

//        // list of each employee joining date
//
//        List<LocalDate> empJoiningDate = employeeList.stream()
//                .map(employee -> employee.joiningDate())
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(empJoiningDate);

////        Sort employees by salary.
//        List<Employee> empBySalary = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::salary))
//                .collect(Collectors.toList());
////        System.out.println(empBySalary);
//
//        empBySalary.forEach((emp) ->
//                System.out.println("Name: "+ emp.name()+ " Salary : "+emp.salary()));

////        Sort employees by age.
//        List<Employee> empByAge = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::age))
//                .collect(Collectors.toList());
//
//        empByAge.forEach(emp->
//                System.out.println("Employee Name: "+emp.name()+" age: "+emp.age()));

////        Group employees by city.
//        Map<String,List<Employee>> groupEmpByCity = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::city));
//
////        System.out.println(groupEmpByCity);
//        groupEmpByCity.forEach((city,employee) ->{
//            employee.forEach(emp ->
//                    System.out.println("name: "+emp.name()+" city: "+emp.city()));
//        });

////        Find the department with the highest average salary.
//
//        Map<String,Double> avgSalaryByDept = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::department,
//                        Collectors.averagingDouble(Employee::salary)));
//
//        Map.Entry<String,Double> highestSalaryByDept =avgSalaryByDept.entrySet()
//                .stream().max(Map.Entry.comparingByValue())
//                .orElseThrow(()-> new RuntimeException("no dept found"));
//
//        System.out.println(highestSalaryByDept.getKey()+ " "+highestSalaryByDept.getValue());

////        Find the top 3 highest-paid employees.
//        List<Employee> top3HighestPaidEmplyee = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::salary).reversed())
//                .limit(3)
//                        .toList();
//
////        System.out.println(top3HighestPaidEmplyee);
//
//        top3HighestPaidEmplyee.forEach(emp ->
//                System.out.println("Name : "+emp.name()+ " Salary: "+ emp.salary()));

//        Find the second-highest salary.
        List<Employee> secondHighestSalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .skip(1)
                .limit(1)
                .toList();
        System.out.println(secondHighestSalary);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}