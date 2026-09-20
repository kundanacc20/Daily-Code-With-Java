package com.kundan.day14may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(8);

        root.left.left = new Node(9);
        root.left.right = new Node(11);

        root.right.left = new Node(19);
        root.right.right = new Node(900);

        LevelOrderTraversal traversal = new LevelOrderTraversal();
        traversal.levelOrder(root);
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms.");
    }
}
