package com.kundan.day08april2026;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class MainApr001 {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;

        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev =head;
            head = next;
        }
        return prev;
    }

    public void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainApr001 rll = new MainApr001();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        rll.printList(head);

        ListNode reversedHead = rll.reverseList(head);

        System.out.println("Reversed List: ");
        rll.printList(reversedHead);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Timer: "+programTime+" ms");
    }
}
