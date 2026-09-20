package com.kundan.day22may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root,11);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root,13);
        tree.root = tree.insert(tree.root, 14);
        tree.root = tree.insert(tree.root, 15);

        System.out.println("Inoreder traversal of AVL tree: ");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root,11);
        System.out.println("\nAfter deleting 13:");
        tree.inorder(tree.root);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
