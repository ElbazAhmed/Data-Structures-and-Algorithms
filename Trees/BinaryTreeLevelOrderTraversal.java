package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-level-order-traversal/
    // Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i=0; i<levelSize; i++){
                TreeNode node = queue.remove();
                level.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(level);
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
