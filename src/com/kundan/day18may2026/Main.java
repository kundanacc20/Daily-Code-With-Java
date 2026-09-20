package com.kundan.day18may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(11);

        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(15);
        root.left.right = new Node(14);

        root.right.left = new Node(16);
        root.right.right = new Node(17);

        int totalNodes = BinaryTreeCount.count(root);
        System.out.println("Total number of nodes: "+ totalNodes);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
