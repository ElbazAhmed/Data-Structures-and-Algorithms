package Trees;

import java.util.ArrayList;

public class LeafSimilarTrees {
    // https://leetcode.com/problems/leaf-similar-trees/
    // Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
    // For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
    //Two binary trees are considered leaf-similar if their leaf value sequence is the same.
    //Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        leafsList(root1, list1);
        leafsList(root2, list2);

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }
    public void leafsList(TreeNode node, ArrayList<Integer> list){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            list.add(node.val);
        }
        leafsList(node.left,list);
        leafsList(node.right,list);
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
