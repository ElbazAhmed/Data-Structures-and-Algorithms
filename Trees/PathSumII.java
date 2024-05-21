package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    // https://leetcode.com/problems/path-sum-ii/
    // Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum.
    // Each path should be returned as a list of the node values, not node references.
    //A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        pathSum(root,targetSum,new ArrayList<Integer>(),list);
        return list;

    }
    public void pathSum(TreeNode root, int targetSum,List<Integer> path,List<List<Integer>> list){
        if (root == null) {
            return;
        }

        path.add(root.val);
        targetSum -= root.val;

        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                list.add(new ArrayList<>(path));
            }
        }
        pathSum(root.left, targetSum,path, list);
        pathSum(root.right, targetSum,path, list);

        path.remove(path.size() - 1);
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
