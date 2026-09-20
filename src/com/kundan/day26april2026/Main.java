package com.kundan.day26april2026;

record Point(int x, int y){}
public class Main {
    public static void main(String[] args) {
        //start timer
        long startTimer = System.nanoTime();
        Object obj = new Point(1,2);

        if(obj instanceof  Point(int x, int y)){
            System.out.println("Coordinates: "+x+", "+y);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
