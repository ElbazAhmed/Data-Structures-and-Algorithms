package Trees;

public class SameTree {
    // https://leetcode.com/problems/same-tree/
    // Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    //Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p == null && q == null) return true;
        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

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
