package com.kundan.day11july2026;

@FunctionalInterface
public interface Demo {
    void show();

    default void display() {
        System.out.println("Default Method");
    }
}
