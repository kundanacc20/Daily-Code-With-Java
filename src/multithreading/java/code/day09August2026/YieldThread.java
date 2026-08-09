package multithreading.java.code.day09August2026;

public class YieldThread extends Thread{

    public void run(){
        for(int i = 0; i<=4; i++){
            System.out.println("yieldThread "+i);
            Thread.yield();
        }
    }
}
