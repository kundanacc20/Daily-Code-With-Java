package multithreading.java.code.day09August2026;

public class Worker  extends Thread{

    @Override
    public void run(){
        for(int i =0; i<=4; i++){
            System.out.println("worker node "+i);
        }
    }
}
