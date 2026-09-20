package com.kundan.day24may2026;

public class AVLTree {
    private Node root;

    private int height(Node n) {
        return n == null ? 0 : n.height;
    }

    private int balanceFactor(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    private void updateHeight(Node n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        y.left = x.right;
        x.right = y;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        updateHeight(x);
        updateHeight(y);
        return y;
    }

    private Node rebalance(Node n) {
        updateHeight(n);
        int bf = balanceFactor(n);

        if (bf > 1) { // Left heavy
            if (balanceFactor(n.left) < 0)
                n.left = rotateLeft(n.left); // LR case
            return rotateRight(n);           // LL case
        }
        if (bf < -1) { // Right heavy
            if (balanceFactor(n.right) > 0)
                n.right = rotateRight(n.right); // RL case
            return rotateLeft(n);               // RR case
        }
        return n;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node n, int key) {
        if (n == null) return new Node(key);
        if (key < n.key)      n.left  = insert(n.left,  key);
        else if (key > n.key) n.right = insert(n.right, key);
        else                  return n; // no duplicates
        return rebalance(n);
    }

    public boolean search(int key) {
        Node n = root;
        while (n != null) {
            if      (key == n.key) return true;
            else if (key <  n.key) n = n.left;
            else                   n = n.right;
        }
        return false;
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.key + " ");
        inOrder(n.right);
    }
}
