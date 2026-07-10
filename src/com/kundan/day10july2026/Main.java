package com.kundan.day10july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //Build a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        //serialize
        SerializeTree serializer = new SerializeTree();
        String serialized = serializer.serialize(root);
        System.out.println("Serialized Tree: "+serialized);

        //Deserialize
        DeserializeTree deserializer = new DeserializeTree();
        TreeNode newRoot = deserializer.deserialize(serialized);
        System.out.println("Deserialization complete. Root value: "+newRoot.val);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
