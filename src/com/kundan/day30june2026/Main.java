package com.kundan.day30june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Day today = Day.SATURDAY;
        String result = DayClassifier.classifyDay(today);

        System.out.println("Day: "+today);
        System.out.println("Classification: "+result);

        //try another example
        Day anotherDay = Day.WEDNESDAY;
        System.out.println("Day: "+anotherDay);
        System.out.println("Classification: "+DayClassifier.classifyDay(anotherDay));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
