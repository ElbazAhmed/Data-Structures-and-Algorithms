package Trees;

public class BalancedBinaryTree {
    // https://leetcode.com/problems/balanced-binary-tree/
    // Given a binary tree, determine if it is height-balanced
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftHeight = 1 + NodeHeight(root.left);
        int rightHeight = 1 + NodeHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && (isBalanced(root.left) && isBalanced(root.right));

    }
    public int NodeHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftHeight = 1 + NodeHeight(node.left);
        int rightHeight = 1 + NodeHeight(node.right);
        return Math.max(leftHeight,rightHeight);
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
