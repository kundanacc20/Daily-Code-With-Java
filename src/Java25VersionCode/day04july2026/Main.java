package Java25VersionCode.day04july2026;

public class Main {
    public static  void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
        //call direct virtual thread
        VirtualWorker directWorker = new VirtualWorker();
        directWorker.runDirect();

        System.out.println();

        //call factory-based virtual thread
        VirtualWorkerFactory factoryWorker = new VirtualWorkerFactory();
        factoryWorker.runWithFactory();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
