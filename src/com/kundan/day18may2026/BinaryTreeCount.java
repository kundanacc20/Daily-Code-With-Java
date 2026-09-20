package com.kundan.day18may2026;

public class BinaryTreeCount {
    //Method to count all nodes in the tree
    public static int count(Node root){
        if(root ==null){
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }
}
