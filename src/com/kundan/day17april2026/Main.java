package com.kundan.day17april2026;

public class Main {
    public static void printShapeInfo(Shape shape){
        if(shape instanceof Circle c){
            System.out.println("This is a circle with radius "+c.radius);
        } else if (shape instanceof Rectangle r){
            System.out.println("This is a Rectangle with length "+ r.length + " base: "+r.width);
        } else if(shape instanceof Triangle t) {
            System.out.println("this is a triangle with base "+t.base + " and "+t.height);
        }
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 4.0);
        Triangle triangle = new Triangle(6.0, 3.0);
        RightTriangle rightTriangle = new RightTriangle(8.0, 4.0);

        //print details
        System.out.println("Circle with radius: "+ circle.radius);
        System.out.println("Rectangle with length: "+rectangle.length+" and width: "+rectangle.width);
        System.out.println("Triangle with base: "+ triangle.base+ " and height "+ triangle.height);
        System.out.println("RightTriangle with base: "+ rightTriangle.base+" height: "+ rightTriangle.height);

        //example of using sealed classes with instanceof pattern matching
        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
        printShapeInfo(rightTriangle);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
