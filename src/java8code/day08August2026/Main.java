package java8code.day08August2026;

import java8code.day06August2026.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

//        List<Employees> empList = Arrays.asList(
//                new Employees(100, "kundan kumar",1000000),
//                new Employees(101, "kumar",80000),
//                new Employees(102, "prajapati",90000),
//                new Employees(104,"kunal",850000)
//        );
//
//        Map<Boolean,List<Employees>> finalList= empList.stream()
//                .collect(Collectors.partitioningBy(e ->e.salary()>85000));
//
//        System.out.println(finalList);

        List<Integer> numbers = Arrays.asList(1,82,3,9,4,12,90,44,1,3,3);

        Set<Integer> finalResult = numbers.stream().collect(Collectors.toSet());

        System.out.println(finalResult);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ "ms");
    }
}
