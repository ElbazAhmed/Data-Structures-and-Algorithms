package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
    // https://leetcode.com/problems/average-of-levels-in-binary-tree/
    // Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
    // Answers within 10-5 of the actual answer will be accepted.
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            long levelSum = 0;
            int levelSize = queue.size();
            for(int i=0; i<levelSize; i++){
                TreeNode node = queue.poll();
                levelSum += node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add((double) levelSum/levelSize);
        }
        return list;
    }

    public class TreeNode {
      private int val;
      private TreeNode left;
      private TreeNode right;
      public TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
