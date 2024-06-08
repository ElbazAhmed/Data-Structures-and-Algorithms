package Arrays;

import java.util.HashMap;

public class ContinuousSubarraySum {
    // https://leetcode.com/problems/continuous-subarray-sum/
    // Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
    //A good subarray is a subarray where:
    //    its length is at least two, and
    //    the sum of the elements of the subarray is a multiple of k.
    //Note that:
    //    A subarray is a contiguous part of the array.
    //    An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
    public boolean checkSubarraySum(int[] nums, int k) {
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<length; i++){
            sum+=nums[i];
            sum = sum%k;
            if(sum == 0 && i>=1) return true;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}
