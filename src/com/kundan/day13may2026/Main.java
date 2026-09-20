package com.kundan.day13may2026;

public class Main {
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left= new Node(4);
        root.left.right= new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Tree created");

        System.out.println("Inorder Traversal of Tree data structure: ");
        inorder(root);
        System.out.println();

        System.out.println("Preorder Traversal of Tree data structure: ");
        preorder(root);
        System.out.println();

        System.out.println("Postorder Traversal of Tree data structure: ");
        postorder(root);
        System.out.println();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
