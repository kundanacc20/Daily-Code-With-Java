package multithreading.java.code.day24August2026;

public class Printer {
    synchronized void printDocument(String employee, String document){
        System.out.println(employee+ " document started printing "+document);
        for (int i = 1; i<=5;i++){
            System.out.println(employee+ " printing page : "+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(employee+" finishing document printing "+document);
    }
}
/*
Problem:
There is one shared printer and multiple employees
want to print documents simultaneously.
Only one employee should use the printer at a time.
 */