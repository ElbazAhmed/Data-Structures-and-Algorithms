package Arrays;

public class MaximumSubarray {
    // https://leetcode.com/problems/maximum-subarray/
    // Given an integer array nums, find the subarray with the largest sum, and return its sum.

    public int maxSubArray(int[] nums) {
        int maxEnding = 0;
        int maxSoFar = Integer.MIN_VALUE;
        for(int n : nums){
            maxEnding+=n;
            maxEnding = Math.max(n,maxEnding);
            maxSoFar = Math.max(maxSoFar,maxEnding);
        }
        return maxSoFar;
    }
}
