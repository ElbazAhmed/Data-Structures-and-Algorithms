package BinarySearchAlgorithm;

import java.util.Arrays;

public class FirstandLastPositionofElement {
    //Given an array of integers nums sorted in non-decreasing order,
    // find the starting and ending position of a given target value.
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(SearchRange(nums,target)));

    }

    static int[] SearchRange(int[] nums, int target){
        int start = searchIndex(nums,target,true);
        int end = searchIndex(nums,target,false);
        return new int[]{start,end};
    }

    static int searchIndex(int[] nums, int target, boolean finStartIndex){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            //find the middle element
            int middle=(start + end)/2;
            if (target < nums[middle]) {
                end=middle-1;
            } else if (target > nums[middle]) {
                start=middle+1;
            }else{
                index = middle;
                if(finStartIndex == true){
                    end = middle-1;
                }else{
                    start = middle+1;
                }
            }
        }
        return index;
    }
}
