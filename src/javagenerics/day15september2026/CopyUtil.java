package javagenerics.day15september2026;

import java.util.List;

public class CopyUtil {
    public static <T> void copy(List<? extends T> src, List<? super T> dest){
        for (T item: src){
            dest.add(item);
        }
    }
}
