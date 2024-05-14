package Trees;

public class PathSum {
    // https://leetcode.com/problems/path-sum/
    // Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
    //A leaf is a node with no children.

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null || (root == null && targetSum != 0)){
            return false;
        }
        targetSum = targetSum - root.val;
        if(root.left == null && root.right == null && targetSum == 0){
            return true;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
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
