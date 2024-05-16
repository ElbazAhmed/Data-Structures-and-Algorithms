package Trees;

public class EvaluateBooleanBinaryTree {
    // https://leetcode.com/problems/evaluate-boolean-binary-tree/
    //You are given the root of a full binary tree with the following properties:
    //    Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
    //    Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.
    // Return the boolean result of evaluating the root node.
    public boolean evaluateTree(TreeNode root) {
        if(root.val == 2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        if(root.val == 3){
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
        if(root.val == 0){
            return false;
        }
        return true;
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
