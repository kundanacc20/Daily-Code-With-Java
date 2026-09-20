package com.kundan.day26june2026;

public class ShapeUtil {
    public static String describe(Shape shape){
        return switch (shape) {
            case Circle c ->
                "circle with radius %.2f, Area = %.2f"
                        .formatted(c.radius(),c.area());

            case Square s ->
                "Square with side %.2f, Area = %.2f"
                        .formatted(s.width(),s.area());

            case NormalRectangle r ->
                "Rectangle %.2f x %.2f, Area = %.2f"
                        .formatted(r.width(),r.height(),r.area());
            case Triangle t ->
                "Triangle, Area = %.2f"
                        .formatted(t.area());
        };
    }
}
