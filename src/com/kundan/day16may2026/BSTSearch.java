package com.kundan.day16may2026;

public class BSTSearch {
    public boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data ==key){
            return true;
        }

        if(key < root.data){
            return search(root.left,key);
        }
        return search(root.right, key);
    }
}
