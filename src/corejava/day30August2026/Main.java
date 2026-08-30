package corejava.day30August2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Day today = Day.MONDAY;

        if(today == Day.SATURDAY || today == Day.SUNDAY){
            System.out.println("today is weekend");
        } else {
            System.out.println("today is weekdays");
        }

        //iterating over enum

        for(Day d: Day.values()){
            System.out.println(d);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
