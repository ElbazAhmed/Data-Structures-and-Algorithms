package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TheNumberofBeautifulSubsets {
    // https://leetcode.com/problems/the-number-of-beautiful-subsets/
    // You are given an array nums of positive integers and a positive integer k.
    //A subset of nums is beautiful if it does not contain two integers with an absolute difference equal to k.
    //Return the number of non-empty beautiful subsets of the array nums.
    //A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums.
    // Two subsets are different if and only if the chosen indices to delete are different.
    public int beautifulSubsets(int[] nums, int k) {
        return beautifulSubsets(nums,k,0,new ArrayList<Integer>())-1;
    }
    public int beautifulSubsets(int[] nums, int k, int start, List<Integer> current){
        int count = 1;
        for(int i=start; i<nums.length; i++){
            if(isBeautiful(current,nums[i],k)){
                current.add(nums[i]);
                count += beautifulSubsets(nums,k,i+1,current);
                current.remove(current.size()-1);
            }
        }
        return count;
    }

    public boolean isBeautiful(List<Integer> list,int n, int k){
        for (int existingNum : list) {
            if (Math.abs(existingNum - n) == k) {
                return false;
            }
        }
        return true;
    }
}
