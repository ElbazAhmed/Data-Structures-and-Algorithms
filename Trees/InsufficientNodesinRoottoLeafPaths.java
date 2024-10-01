package Trees;

public class InsufficientNodesinRoottoLeafPaths {
    // https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/
    // Given the root of a binary tree and an integer limit, delete all insufficient nodes in the tree simultaneously,
    // and return the root of the resulting binary tree.
    //A node is insufficient if every root to leaf path intersecting this node has a sum strictly less than limit.
    //A leaf is a node with no children.

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return sufficientSubset(root,limit, 0);
    }

    public TreeNode sufficientSubset(TreeNode root, int limit, int sum) {
        if(root == null) return null;

        sum += root.val;

        if(root.left == null && root.right == null){
            return sum < limit ? null : root;
        }

        root.left = sufficientSubset(root.left,limit, sum);
        root.right = sufficientSubset(root.right,limit, sum);

        if (root.left == null && root.right == null) {
            return null;
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
