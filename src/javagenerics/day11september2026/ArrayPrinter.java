package javagenerics.day11september2026;

public class ArrayPrinter<T> implements Printer<T> {

    @Override
    public void print(T[] array) {
        for(T x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
