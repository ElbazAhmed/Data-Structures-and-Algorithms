package Trees;

import java.util.ArrayList;
import java.util.List;

public class BalanceaBinarySearchTree {
    // https://leetcode.com/problems/balance-a-binary-search-tree/
    // Given the root of a binary search tree, return a balanced binary search tree with the same node values.
    // If there is more than one answer, return any of them.
    //A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.

    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);

        return buildBalancedBST(nodes, 0, nodes.size() - 1);
    }
    private void inorderTraversal(TreeNode node, List<TreeNode> nodes) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, nodes);
        nodes.add(node);
        inorderTraversal(node.right, nodes);
    }

    private TreeNode buildBalancedBST(List<TreeNode> nodes, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = nodes.get(mid);

        root.left = buildBalancedBST(nodes, start, mid - 1);
        root.right = buildBalancedBST(nodes, mid + 1, end);

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
