package javagenerics.day17september2026;

import java.io.Serializable;

public class MultiBound {
    public static <T extends Comparable<T> & Serializable> T max(T a, T b){
        return a.compareTo(b) >= 0 ? a : b;
    }
}
