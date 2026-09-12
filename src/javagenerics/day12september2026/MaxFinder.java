package javagenerics.day12september2026;

public class MaxFinder {
    public static <T extends Comparable<T>> T findMax(T num1, T num2) {
        return (num1.compareTo(num2) > 0) ? num1 : num2;
    }
}
