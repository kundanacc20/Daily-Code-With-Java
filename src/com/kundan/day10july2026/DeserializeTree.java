package com.kundan.day10july2026;

import java.util.LinkedList;
import java.util.Queue;

public class DeserializeTree {
    public TreeNode deserialize(String data){
        if(data == null || data.isEmpty())
            return null;

        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i =1;
        while(!queue.isEmpty() && i < values.length){
            TreeNode node = queue.poll();

            if(!values[i].equals("null")){
                node.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(node.left);
            }
            i++;

            if(i < values.length && !values[i].equals("null")){
                node.right = new TreeNode(Integer.parseInt(values[i]));
            }
            i++;
        }
        return root;
    }
}
