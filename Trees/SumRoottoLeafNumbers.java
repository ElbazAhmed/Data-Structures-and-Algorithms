package Trees;

public class SumRoottoLeafNumbers {
    // https://leetcode.com/problems/sum-root-to-leaf-numbers/
    // You are given the root of a binary tree containing digits from 0 to 9 only.
    //Each root-to-leaf path in the tree represents a number.
    //    For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
    //Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
    //A leaf node is a node with no children.
    
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root,0);
    }
    public int sumNumbers(TreeNode root,int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return sumNumbers(root.left, sum) + sumNumbers(root.right, sum);
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
