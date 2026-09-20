package com.kundan.day10march2026;

public class MainM010 {
    public static void main(String[] args){
        //start time
        long startTimer = System.nanoTime();
        Car car = new Car();
        car.start();
        car.type();

        HeavyTruck truck = new HeavyTruck();
        truck.start();
        truck.load();
        truck.capacity();

        Bike bike = new Bike();
        bike.start();
        bike.ride();
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program time: "+programTime+" ms");
    }
}
