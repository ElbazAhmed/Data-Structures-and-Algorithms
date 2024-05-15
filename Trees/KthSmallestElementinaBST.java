package Trees;

public class KthSmallestElementinaBST {
    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    // Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

    int i = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        int left = kthSmallest(root.left,k);
        if(left != 0){
            return left;
        }
        i++;
        if(i == k){
            return root.val;
        }
        return kthSmallest(root.right,k);

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
