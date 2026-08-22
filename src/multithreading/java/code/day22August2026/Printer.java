package multithreading.java.code.day22August2026;

public class Printer {

    synchronized static void print(String name){
        for(int i =1; i<= 5; i++){
            System.out.println(name+" "+i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
