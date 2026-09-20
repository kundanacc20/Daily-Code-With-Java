package multithreading.java.code.day07August2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Thread thread = new Thread(MyRunnableTask.createTask("Hello Thread"));

        thread.start();

        Runnable mainTask = MyRunnableTask.createTask("Hello from Main");
        mainTask.run();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }

        System.out.println("Both threads finished execution!");
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time : "+programTime+ " ms");
    }
}
