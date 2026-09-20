package javagenerics.day11september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Printer intPrinter = new ArrayPrinter();
        Printer strPrinter = new ArrayPrinter();

        Integer[] intArray = {1,2,3,4};
        String[] strArray = {"abc","def","ghi"};

        intPrinter.print(intArray);
        strPrinter.print(strArray);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
