package com.kundan.day3may2026;

public class Main {
    public static double getPerimeter(Shape s){
        if(s instanceof Rectangle r){
            return 2* r.length()+ 2*r.width();
        } else if(s instanceof Circle c){
            return 2*c.radius()*Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Shape rect = new Rectangle(10,5);
        Shape circle = new Circle(7);

        System.out.println("Rectangle perimeter: "+getPerimeter(rect));
        System.out.println("Circle perimeter: "+getPerimeter(circle));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
