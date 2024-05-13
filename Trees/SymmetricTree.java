package Trees;

public class SymmetricTree {
    // https://leetcode.com/problems/symmetric-tree/
    // Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }
    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
    }

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
  }
}
