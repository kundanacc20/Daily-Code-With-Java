package com.kundan.day09july2026;

public class RBNode {
    int data;
    RBNode left, right, parent;
    boolean color; //true = red, false = black

    public RBNode(int data){
        this.data = data;
        this.color = true;
        this.left = this.right =this.parent = null;
    }
}
