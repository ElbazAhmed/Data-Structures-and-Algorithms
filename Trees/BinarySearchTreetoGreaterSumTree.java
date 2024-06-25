package Trees;

public class BinarySearchTreetoGreaterSumTree {
    // https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
    // Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
    //As a reminder, a binary search tree is a tree that satisfies these constraints:
    //    The left subtree of a node contains only nodes with keys less than the node's key.
    //    The right subtree of a node contains only nodes with keys greater than the node's key.
    //    Both the left and right subtrees must also be binary search trees.

    public TreeNode bstToGst(TreeNode root) {
        ReverseInOrderTraversal(root,new int[]{0});
        return root;
    }
    public void ReverseInOrderTraversal(TreeNode root, int[] reminder){
        if(root == null) return;
        ReverseInOrderTraversal(root.right, reminder);
        root.val = root.val + reminder[0];
        reminder[0] = root.val;
        ReverseInOrderTraversal(root.left, reminder);
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
