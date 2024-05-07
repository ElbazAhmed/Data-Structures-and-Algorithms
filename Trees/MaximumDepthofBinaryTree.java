package Trees;

public class MaximumDepthofBinaryTree {
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    // Given the root of a binary tree, return its maximum depth.
    //A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = 1 + maxDepth(root.left);
        int rightDepth = 1 + maxDepth(root.right);

        return Math.max(leftDepth,rightDepth);
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
