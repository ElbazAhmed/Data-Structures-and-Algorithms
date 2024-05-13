package Trees;

public class CousinsinBinaryTree {
    // https://leetcode.com/problems/cousins-in-binary-tree/
    // Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y,
    // return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
    //Two nodes of a binary tree are cousins if they have the same depth with different parents.
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode node1 = findNode(root,x);
        TreeNode node2 = findNode(root,y);
        return level(node1,root,0) == level(node2,root,0) && !isSiblings(node1,node2,root);
    }
    public boolean isSiblings(TreeNode node1, TreeNode node2, TreeNode root){
        if(root == null){
            return false;
        }
        return (root.left == node1 && root.right == node2) || (root.left == node2 && root.right == node1) || isSiblings(node1,node2,root.left) || isSiblings(node1,node2,root.right);
    }

    public int level(TreeNode node, TreeNode root, int height){
        if(root == null){
            return 0;
        }
        if(node == root){
            return height;
        }
        int leftHeight = level(node,root.left,height+1);
        if(leftHeight != 0){
            return leftHeight;
        }
        return level(node,root.right,height+1);
    }

    public TreeNode findNode(TreeNode root, int x){
        if(root == null){
            return root;
        }
        if(root.val == x){
            return root;
        }
        TreeNode node = findNode(root.left,x);
        if(node != null){
            return node;
        }
        return findNode(root.right,x);
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
