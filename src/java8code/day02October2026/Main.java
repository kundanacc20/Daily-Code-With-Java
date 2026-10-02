package java8code.day02October2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Employee> emplist = Arrays.asList(
                new Employee(1,"kundan","dev",27,50000,"male"),
                new Employee(2,"narayan","architect",20,50000,"male"),
                new Employee(3,"Harsht","NewReporter",29,60000,"male"),
                new Employee(4,"komal","QA",28,40000,"female")
        );

        Map<String,Long> maleAndFemaleCount = emplist.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()
                ));

        System.out.println(maleAndFemaleCount);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
