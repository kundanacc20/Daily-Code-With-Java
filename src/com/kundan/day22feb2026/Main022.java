package com.kundan.day22feb2026;

public class Main022 {
    public static void main(String[] args){
        Thread t1 =new Thread(()->System.out.println("thread t1 is running"));
        Thread t2 =new Thread(()->System.out.println("thread t2 is running"));
        Thread t3 =new Thread(()->System.out.println("thread t3 is running"));

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
