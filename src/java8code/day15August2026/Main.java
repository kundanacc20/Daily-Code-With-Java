package java8code.day15August2026;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        List<Integer> numList = Arrays.asList(1,4,2,9,41,98,19);
//
//        int sum = numList.stream().reduce(0, Integer::sum);
//
//        System.out.println(sum);

//         Flatten Nested Lists
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7),
                Arrays.asList(8,9,10));
//
//        listOfList.stream().flatMap(Collection::stream)
////                .forEach(System.out::print);
//                .forEach(n -> System.out.print(n+ " ");

//        List<Integer> finalList = listOfList.stream().flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println(finalList);

//        Map<Integer , List<String>> mapListOfWords = new HashMap<>();
//        mapListOfWords.put(1,Arrays.asList("kundan","sailesh","narayan"));
//        mapListOfWords.put(2,Arrays.asList("bhaushaheb","aditya","rajak","satyam"));
//
//        List<String> finalMappedList = mapListOfWords.values().stream()
//                .flatMap(List::stream).collect(Collectors.toList());
//
//        System.out.println(finalMappedList);

////         Find Top 3 Highest Numbers
//        List<Integer> numlst = Arrays.asList(1,9,2,11,12,19,17,14);
//
//        List<Integer> top3NumInList = numlst.stream().sorted((a,b) -> b - a)
//                .limit(3).toList();
//
//        System.out.println(top3NumInList);

//         Find Employee with Longest Name

        List<Employee> empList = Arrays.asList(new Employee("Kundan", "software", 27),
                new Employee("narayan","beam executive",21),
                new Employee("anil", "data analyst",21));

        Optional<Employee> longestEmpName = empList.stream()
//                .max(Comparator.comparing(Employee::name));
        .max(Comparator.comparingInt(e->e.name().length()));

        System.out.println(longestEmpName.orElse(null));


        //end timer
        long endTimer = System.nanoTime();
        System.out.println();
        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}
