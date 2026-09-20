package javagenerics.day14september2026;

import java.util.List;

public class WildcardSum {
    public static double sum(List<? extends Number> list){
        double sumTotal = 0;
        for(Number n : list){
            sumTotal += n.doubleValue();
        }
        return sumTotal;
    }
}
