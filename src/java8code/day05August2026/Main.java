package java8code.day05August2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //1. Group Employees by Department
        List<Employees> emplst = Arrays.asList(
                new Employees("kundan",1000000,"developer"),
                new Employees("kumar",100009,"developer"),
                new Employees("harsheet",100008, "marketing"));
        Map<String,List<Employees>> finalEmpList = emplst.stream()
                .collect(Collectors.groupingBy(Employees::getDept));

        System.out.println(finalEmpList);

        //get employee by dept = developer

        List<Employees> devDept = finalEmpList.get("developer");
        System.out.println("developers : "+devDept);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/(1_000_000);

        System.out.println("program time: "+programTime+ " ms");
    }
}
