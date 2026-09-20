package multithreading.java.code.day06August2026;

public class NumberThread extends Thread {

    @Override
    public void run(){

        for(int i =1; i<= 10; i++){
            System.out.println("thread: "+i+" is running");
        }
    }
}
