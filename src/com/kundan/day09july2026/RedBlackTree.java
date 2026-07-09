package com.kundan.day09july2026;

public class RedBlackTree {
    private RBNode root;
    private final RBNode NIL;

    public RedBlackTree() {
        NIL = new RBNode(0);
        NIL.color = false; // NIL is always black
        root = NIL;
    }

    // Left Rotate
    private void leftRotate(RBNode x) {
        RBNode y = x.right;
        x.right = y.left;
        if (y.left != NIL) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    // Right Rotate
    private void rightRotate(RBNode y) {
        RBNode x = y.left;
        y.left = x.right;
        if (x.right != NIL) x.right.parent = y;
        x.parent = y.parent;
        if (y.parent == null) root = x;
        else if (y == y.parent.right) y.parent.right = x;
        else y.parent.left = x;
        x.right = y;
        y.parent = x;
    }

    // Insert Node
    public void insert(int data) {
        RBNode node = new RBNode(data);
        node.left = node.right = NIL;

        RBNode parent = null;
        RBNode current = root;

        while (current != NIL) {
            parent = current;
            if (node.data < current.data) current = current.left;
            else current = current.right;
        }

        node.parent = parent;
        if (parent == null) root = node;
        else if (node.data < parent.data) parent.left = node;
        else parent.right = node;

        node.color = true; // new node is red
        fixInsert(node);
    }

    // Fix Violations
    private void fixInsert(RBNode node) {
        while (node.parent != null && node.parent.color) {
            if (node.parent == node.parent.parent.left) {
                RBNode uncle = node.parent.parent.right;
                if (uncle.color) {
                    node.parent.color = false;
                    uncle.color = false;
                    node.parent.parent.color = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        leftRotate(node);
                    }
                    node.parent.color = false;
                    node.parent.parent.color = true;
                    rightRotate(node.parent.parent);
                }
            } else {
                RBNode uncle = node.parent.parent.left;
                if (uncle.color) {
                    node.parent.color = false;
                    uncle.color = false;
                    node.parent.parent.color = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rightRotate(node);
                    }
                    node.parent.color = false;
                    node.parent.parent.color = true;
                    leftRotate(node.parent.parent);
                }
            }
        }
        root.color = false; // root is always black
    }

    // Inorder Traversal
    public void inorderTraversal(RBNode node) {
        if (node != NIL) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public RBNode getRoot() {
        return root;
    }
}

