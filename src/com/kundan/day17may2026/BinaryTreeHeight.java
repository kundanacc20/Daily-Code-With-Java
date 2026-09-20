package com.kundan.day17may2026;

public class BinaryTreeHeight {
    static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
