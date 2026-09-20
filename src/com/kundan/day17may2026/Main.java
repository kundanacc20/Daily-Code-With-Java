package com.kundan.day17may2026;

public class Main {
    public static void main(String[] args){
        //start timer

        long startTimer = System.nanoTime();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(16);
        root.right.right = new Node(15);

        int treeHeight = BinaryTreeHeight.height(root);
        System.out.println("Height of tree is :"+ treeHeight);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
