package Trees;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
    // Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
    // (i.e., from left to right, then right to left for the next level and alternate between).
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagLevels = new ArrayList<List<Integer>>();
        if(root == null){
            return zigzagLevels;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(levelSize != 0){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                levelSize--;
            }
            if(reverse){
                Collections.reverse(list);
                zigzagLevels.add(list);
                reverse = false;
            }else{
                zigzagLevels.add(list);
                reverse = true;
            }
        }
        return zigzagLevels;
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
