package com.kundan.day10march2026;

sealed class Vehicle permits Car,Truck,Bike {
    public void start(){
        System.out.println("Vehicle is starting ...");
    }
}
//Here only Car,Truck and Bike are allowed to extend Vehicle
/*sealed classes and interfaces allowed you to restrict which class can
extend or implement them.
this help in designing controlled class hierarchies,improving security,
maintainability and readability.
 */

