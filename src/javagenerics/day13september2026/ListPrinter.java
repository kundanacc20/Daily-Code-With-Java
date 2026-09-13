package javagenerics.day13september2026;

import java.util.List;

public class ListPrinter {
    public static void printList(List<?> list){
        for (Object item: list){
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
