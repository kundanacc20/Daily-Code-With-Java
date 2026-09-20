package multithreading.java.code.day06August2026;

public class HelloTask implements Runnable {

    public void run(){
        for(int i =1; i <= 5; i++){
            System.out.println("hello Task: "+i);
        }
    }
}
