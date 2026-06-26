package com.kundan.day26june2026;

public abstract sealed class Rectangle extends Shape
        permits Square, NormalRectangle {
    protected final double width;
    protected final double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double width(){
        return width;
    }

    public double height(){
        return height;
    }

    @Override
    public double area(){
        return width*height;
    }
}
