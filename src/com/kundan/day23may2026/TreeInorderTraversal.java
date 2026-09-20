package com.kundan.day23may2026;

public class TreeInorderTraversal {
    public static void inorderTraversal(Node root){
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
}
