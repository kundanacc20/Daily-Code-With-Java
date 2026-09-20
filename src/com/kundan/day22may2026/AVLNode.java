package com.kundan.day22may2026;

public class AVLNode {
    int key, height;
    AVLNode left, right;

    public AVLNode(int key){
        this.key= key;
        height = 1;
    }
}
