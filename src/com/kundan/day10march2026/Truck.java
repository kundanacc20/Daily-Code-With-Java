package com.kundan.day10march2026;

sealed class Truck extends Vehicle permits HeavyTruck {
    public void load(){
        System.out.println("truck is loading goods");
    }
}

//Only HeavyTruck can extend Truck.
