package Trees;

public class SearchinaBinarySearchTree {
    // https://leetcode.com/problems/search-in-a-binary-search-tree/
    // You are given the root of a binary search tree (BST) and an integer val.
    //Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
    // If such a node does not exist, return null.

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(val > root.val){
            return searchBST(root.right,val);
        }
        if(val < root.val){
            return searchBST(root.left,val);
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
