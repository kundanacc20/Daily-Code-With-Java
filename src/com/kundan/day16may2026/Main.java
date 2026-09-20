package com.kundan.day16may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        BSTInsertion bst = new BSTInsertion();
        Traversal traversal = new Traversal();
        BSTSearch bstSearch = new BSTSearch();

        Node root = null;

        root = bst.insert(root, 50);
        bst.insert(root, 10);
        bst.insert(root,11);
        bst.insert(root,70);
        bst.insert(root,12);
        bst.insert(root,100);
        bst.insert(root,99);
        bst.insert(root, 40);

        System.out.println("Inorder Traversal: ");
        traversal.inorder(root);
        System.out.println();

        System.out.println("Search Results:");
        int key = 40;
        if(bstSearch.search(root,key)){
            System.out.println(key+ " found in BST");
        } else {
            System.out.println(key+ " not found in BST");
        }

         key = 41;
        if(bstSearch.search(root,key)){
            System.out.println(key+ " found in BST");
        } else {
            System.out.println(key+ " not found in BST");
        }

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time:" + programTime+" ms");
    }
}
