package Trees;

public class ConvertSortedArraytoBinarySearchTree {
    //https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
    // Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length);
    }

    public TreeNode sortedArrayToBST(int[] nums,int start, int end) {
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        if(mid > start){
            root.left = sortedArrayToBST(nums,start,mid);
        }
        if(mid+1 < end){
            root.right = sortedArrayToBST(nums,mid+1,end);
        }
        return root;
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
