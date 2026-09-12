package javagenerics.day12september2026;

import java.util.List;

public class SumCalculator {
    public static <T extends Number> double sum(List<T> list){
        double total =0;
        for (T x: list){
            total += x.doubleValue();
        }
        return total;
    }
}
