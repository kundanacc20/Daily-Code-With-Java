package corejava.day2september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        for (Day day : Day.values()){
            System.out.println(day);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
        System.out.println("program time: "+programTime+" ms");
    }
}
