package com.kundan.day23may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(2);

        root.left.left = new Node(8);
        root.left.right = new Node(7);

        root.right.left = new Node(3);
        root.right.right = new Node(5);

        System.out.println("Inorder Traversal: ");
        TreeInorderTraversal.inorderTraversal(root);
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+ programTime+ "ms");
    }
}
