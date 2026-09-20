package com.kundan.day09april2026;

public class MainApr001 {
    public boolean hasCycle(ListNode head){
        if(head == null)
            return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
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
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; //create a cycle

        MainApr001 llc = new MainApr001();
        System.out.println(llc.hasCycle(node1));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
