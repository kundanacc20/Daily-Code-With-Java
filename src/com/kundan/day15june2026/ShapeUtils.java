package com.kundan.day15june2026;

public class ShapeUtils {
    public static String describeShape(Shape shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius " + c.radius();
            case Rectangle r -> "Rectangle with length " + r.length() + " and width" + r.width();
        };
    }
        public static double area(Shape shape){
            return switch (shape){
                case Circle c -> Math.PI*c.radius()*c.radius();
                case Rectangle r-> r.length()*r.width();
            };
        }
}
