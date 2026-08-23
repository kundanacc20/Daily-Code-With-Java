package multithreading.java.code.day23August2026;

public class Task {

    static synchronized void execute(){
        for (int i =1; i <= 5; i++){
            System.out.println(
                    Thread.currentThread().getName()
                    +" : "+i
            );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
