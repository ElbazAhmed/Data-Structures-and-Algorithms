package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversals {
    // https://leetcode.com/problems/binary-tree-postorder-traversal/
    // https://leetcode.com/problems/binary-tree-preorder-traversal/
    // https://leetcode.com/problems/binary-tree-inorder-traversal/

    
    // Binary Tree Inorder Traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        if(root == null){
            return traversal;
        }
        inorderTraversal(root,traversal);

        return traversal;
    }
    public void inorderTraversal(TreeNode root, List list) {
        if(root == null){
            return;
        }
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }

    // Binary Tree Preorder Traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        if(root == null){
            return traversal;
        }
        preorderTraversal(root,traversal);

        return traversal;
    }
    public void preorderTraversal(TreeNode root, List list) {
        if(root == null){
            return;
        }
        list.add(root.val);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
    }

    // Binary Tree Postorder Traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        if(root == null){
            return traversal;
        }
        postorderTraversal(root,traversal);

        return traversal;
    }
    public void postorderTraversal(TreeNode root, List list) {
        if(root == null){
            return;
        }
        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.val);
    }

    public class TreeNode {
      private int val;
      private TreeNode left;
      private TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
