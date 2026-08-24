package multithreading.java.code.day24August2026;

public class TablePrinter {

    synchronized void printTable(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
/*
Problem:
Create two threads:

Thread 1 prints multiplication table of 5
Thread 2 prints multiplication table of 10

Use synchronization so that each table is printed completely without mixi
 */