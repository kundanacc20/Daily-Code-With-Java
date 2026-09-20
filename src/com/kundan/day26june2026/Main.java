package com.kundan.day26june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new NormalRectangle(6,3);
        Shape triangle = new Triangle(8,4);
        Shape rightTriangle = new RightTriangle(10,5);

        System.out.println(ShapeUtil.describe(circle));
        System.out.println(ShapeUtil.describe(square));
        System.out.println(ShapeUtil.describe(rectangle));
        System.out.println(ShapeUtil.describe(triangle));
        System.out.println(ShapeUtil.describe(rightTriangle));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
