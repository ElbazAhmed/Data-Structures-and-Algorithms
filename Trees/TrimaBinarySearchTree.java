package Trees;

public class TrimaBinarySearchTree {
    // https://leetcode.com/problems/trim-a-binary-search-tree/
    // Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its elements lies in [low, high].
    // Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant).
    // It can be proven that there is a unique answer.
    //Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        if(root.left == null && root.right == null){
            if(root.val <= high && root.val >= low) return root;
            return null;
        }

        if(root.val > high){
            return trimBST(root.left,low,high);
        }
        if(root.val < low){
            return trimBST(root.right,low,high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
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
