package com.kundan.day16may2026;

public class BSTInsertion {
    public Node insert(Node root, int value){
        if(root == null){
            return new Node(value);
        }

        if(value < root.data){
            root.left = insert(root.left,value);
        } else if(value > root.data){
            root.right = insert(root.right, value);
        }
        return root;
    }
}
