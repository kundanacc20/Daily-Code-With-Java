package java8code.day01August2026;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Employee> empList = Arrays.asList(new Employee(100,"kundan",100000),
                new Employee(101,"harshit",100000),
                new Employee(102,"harishankar",100000));

        List<Employee> finalList = empList.stream()
                .sorted((e1,e2) ->Integer.compare(e1.getId(), e2.getId())).toList();
        System.out.println(finalList);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time :"+programTime+" ms");

    }
}
