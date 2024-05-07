package Trees;

public class DeleteNodeinaBST {
    // https://leetcode.com/problems/delete-node-in-a-bst/
    // Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
    //Basically, the deletion can be divided into two stages:
    //    Search for a node to remove.
    //    If the node is found, delete the node.

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(key > root.val){
            root.right = deleteNode(root.right, key);
            return root;
        }
        if(key < root.val){
            root.left = deleteNode(root.left, key);
            return root;
        }

        if(root.left == null && root.right == null){
            root = null;
            return root;
        }
        if(root.right == null){
            root = root.left;
        }else{
            TreeNode temp = root.right;
            while(temp.left != null){
                temp = temp.left;
            }
            temp.left = root.left;
            root = root.right;
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
