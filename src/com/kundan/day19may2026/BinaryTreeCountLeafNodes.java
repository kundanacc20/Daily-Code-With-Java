package com.kundan.day19may2026;

public class BinaryTreeCountLeafNodes {
    static int countLeaf(Node root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }
        return countLeaf(root.left)+ countLeaf(root.right);
    }
}
