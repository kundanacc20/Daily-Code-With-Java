package com.kundan.day24may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        AVLTree tree = new AVLTree();

        tree.insert(8);
        tree.insert(2);
        tree.insert(6);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        tree.insert(11);
        tree.insert(7);
        tree.insert(5);
        tree.insert(19);
        tree.insert(18);

        System.out.println("Inorder(sorted): ");
        tree.inOrder();

        System.out.println("Search 25: "+tree.search(25));
        System.out.println("Search 19: "+tree.search(19));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+ programTime+" ms");
    }
}
