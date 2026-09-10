package javagenerics.day10september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        //first we will use Box class for string data type
//        Box<String> stringBox = new Box<>();
//
//        stringBox.setValue("kundan");
//        System.out.println(stringBox.getValue());
//        System.out.println(stringBox);

        // now we will test for Integer

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(2);

        integerBox.setValue(3);
        System.out.println(integerBox.getValue());

        System.out.println(integerBox);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time "+programTime+" ms");
    }
}
