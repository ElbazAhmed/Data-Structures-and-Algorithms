package Trees;

public class InsertintoaBinarySearchTree {
    // https://leetcode.com/problems/insert-into-a-binary-search-tree/
    // You are given the root node of a binary search tree (BST) and a value to insert into the tree.
    // Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        TreeNode node = new TreeNode(val);
        if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }
        if(root.val < val){
            root.right = insertIntoBST(root.right, val);
        }
        return root;
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
