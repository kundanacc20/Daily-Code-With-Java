package com.kundan.day21may2026;

public class Main {
    public static void main(String[] args){
        //Start Timer
        long startTimer = System.nanoTime();
        //create nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(-4);

        //Link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        boolean result = DetectCycle.hasCycle(node1);
        System.out.println("Cycle detected: "+result);
        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms.");
    }
}
