package com.kundan.day13april2026;

public class MainApr013 {
    //search method
     static boolean search(Node head, int key){
        for (Node curr = head; curr != null; curr =curr.next){
            if(curr.data==key)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next= new Node(12);
        head.next.next.next = new Node(7);

        int key1 =11;
        int key2 = 12;

        System.out.println("is "+ key1 + " present ?"+search(head,key1));
        System.out.println("is "+ key2 + " present ?"+search(head,key2));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
