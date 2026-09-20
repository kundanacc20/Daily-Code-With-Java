package com.kundan.day16may2026;

public class Traversal {

    //inorder traversal
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
