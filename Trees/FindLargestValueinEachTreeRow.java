package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class FindLargestValueinEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int largestVal = Integer.MIN_VALUE;
            List<Integer> level = new ArrayList<Integer>();
            for(int i=0; i<levelSize; i++){
                TreeNode node = queue.remove();
                largestVal = Math.max(largestVal,node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(largestVal);
        }
        return result;
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
