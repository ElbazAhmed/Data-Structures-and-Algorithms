package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumofaBinaryTree {
    // https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
    // Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
    //Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int maxLevelSum = Integer.MIN_VALUE;
        int level = 0;
        int maxLevel = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            level++;
            int sum = 0;
            for(int i=0; i<levelSize; i++){
                TreeNode node = queue.poll();
                sum+=node.val;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            if(maxLevelSum < sum ){
                maxLevel = level;
                maxLevelSum = sum;
            }
        }
        return maxLevel;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
