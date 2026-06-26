package com.kundan.day26june2026;

public abstract sealed class Shape
        permits Circle,Rectangle,Triangle {
    public abstract double area();
}
