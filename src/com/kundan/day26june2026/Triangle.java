package com.kundan.day26june2026;

public non-sealed class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double base(){
        return base;
    }

    public double height(){
        return height;
    }

    @Override
    public double area(){
        return 0.5*base*height;
    }
}
