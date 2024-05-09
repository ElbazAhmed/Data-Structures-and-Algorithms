package Trees;

public class FlattenBinaryTreetoLinkedList {
    // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    // Given the root of a binary tree, flatten the tree into a "linked list":
    //    The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
    //    The "linked list" should be in the same order as a pre-order traversal of the binary tree.

    public void flatten(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        if(root.left != null){
            TreeNode temp = root.left;
            while(temp.right != null){
                temp = temp.right;
            }
            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
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
