package com.kundan.day19may2026;;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(1);

        root.left = new Node(9);
        root.right = new Node(11);

        root.left.left = new Node(4);
        root.left.right = new Node(6);

        root.right.left = new Node(18);
        root.right.right = new Node(16);
        root.right.right.right =new Node(20);

        int NoOfNode = BinaryTreeCount.count(root);
        System.out.println("Number of nodes in the tree: "+NoOfNode);

        int NoOfCountLeafNodes = BinaryTreeCountLeafNodes.countLeaf(root);
        System.out.println("No of count of leaf nodes: "+NoOfCountLeafNodes);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
