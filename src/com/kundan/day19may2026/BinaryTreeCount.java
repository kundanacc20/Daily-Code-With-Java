package com.kundan.day19may2026;

public class BinaryTreeCount {
    static int count(Node root){
        if(root == null){
            return 0;
        }
        return 1+ count(root.left)+count(root.right);
    }
}
