package com.kundan.day15june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4,6);

        System.out.println(ShapeUtils.describeShape(s1));
        System.out.println("Area: "+ShapeUtils.area(s1));
        System.out.println(ShapeUtils.describeShape(s2));
        System.out.println("Area: "+ShapeUtils.area(s2));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
