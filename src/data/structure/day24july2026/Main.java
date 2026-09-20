package data.structure.day24july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //build sample tree
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Create LCA object
        LCA lcaFinder = new LCA();

        // Find LCA of nodes 5 and 1
        TreeNode ancestor = lcaFinder.lowestCommonAncestor(root, root.left, root.right);
        System.out.println("LCA of 5 and 1: " + ancestor.val);

        // Find LCA of nodes 6 and 4
        TreeNode ancestor2 = lcaFinder.lowestCommonAncestor(root, root.left.left, root.left.right.right);
        System.out.println("LCA of 6 and 4: " + ancestor2.val);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
