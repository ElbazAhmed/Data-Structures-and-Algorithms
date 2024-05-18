package Trees;

public class DistributeCoinsinBinaryTree {
    // https://leetcode.com/problems/distribute-coins-in-binary-tree/
    // You are given the root of a binary tree with n nodes where each node in the tree has node.val coins. There are n coins in total throughout the whole tree.
    //In one move, we may choose two adjacent nodes and move one coin from one node to another. A move may be from parent to child, or from child to parent.
    //Return the minimum number of moves required to make every node have exactly one coin.
    public int distributeCoins(TreeNode root) {
        int res = 0;
        if (root.left != null) {
            res += distributeCoins(root.left);
            root.val += root.left.val - 1;
            res += Math.abs(root.left.val - 1);
        }
        if (root.right != null) {
            res += distributeCoins(root.right);
            root.val += root.right.val - 1;
            res += Math.abs(root.right.val - 1);
        }
        return res;
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
