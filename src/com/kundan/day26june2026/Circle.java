package com.kundan.day26june2026;

public final class Circle extends Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double radius(){
        return radius;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
