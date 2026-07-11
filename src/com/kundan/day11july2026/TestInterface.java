package com.kundan.day11july2026;

@FunctionalInterface
public interface TestInterface {
    void run();

    static void info(){
        System.out.println("Static method inside interface ");
    }
}
