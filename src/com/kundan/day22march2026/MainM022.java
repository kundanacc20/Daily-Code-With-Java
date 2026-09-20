package com.kundan.day22march2026;

public class MainM022 {
    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next =node2;
        node2.next = node3;

        System.out.println("Has cycle (expected false): " + hasCycle(node1));


        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node4.next = node5;
        node5.next = node6;
        node6.next = node4;

        System.out.println("Has cycle (expected true): " + hasCycle(node4));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
