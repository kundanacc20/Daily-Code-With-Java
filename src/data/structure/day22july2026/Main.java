package data.structure.day22july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //create first sorted list
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        //create second sorted list
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        //merge the list
        MergeList merger = new MergeList();
        ListNode mergerdHead = merger.merge(l1,l2);

        //print merged list
        while(mergerdHead != null){
            System.out.print(mergerdHead.val + " ");
            mergerdHead = mergerdHead.next;
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
