package com.kundan.day10july2026;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeTree {
    public String serialize(TreeNode root){
        if(root == null)
            return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            if(node == null){
                sb.append("null, ");
            } else {
                sb.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sb.toString();
    }
}
