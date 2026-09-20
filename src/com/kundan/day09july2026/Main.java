package com.kundan.day09july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        RedBlackTree tree = new RedBlackTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(11);
        tree.insert(12);

        System.out.println("Inorder Traversal of Red-Black Tree: ");
        tree.inorderTraversal(tree.getRoot());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program Time "+programTime+" ms");
    }
}
