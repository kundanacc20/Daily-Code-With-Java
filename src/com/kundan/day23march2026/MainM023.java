package com.kundan.day23march2026;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainM023 {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result =new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size =queue.size();

            List<Integer> level = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node =queue.poll();

                level.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right= new TreeNode(5);
        root.right.right= new TreeNode(6);

        List<List<Integer>> result = levelOrder(root);

        System.out.println("Level Order Traversal: ");
        for(List<Integer> level: result){
            System.out.println(level);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
