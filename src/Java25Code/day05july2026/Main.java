package Java25Code.day05july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ObjectProcessor processor = new ObjectProcessor();

        System.out.println(processor.processObject("Hello"));
        System.out.println(processor.processObject(25));
        System.out.println(processor.processObject(3.14));
        System.out.println(processor.processObject(true));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime =(endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
