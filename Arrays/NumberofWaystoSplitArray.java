package Arrays;

public class NumberofWaystoSplitArray {
    // https://leetcode.com/problems/number-of-ways-to-split-array/
    //You are given a 0-indexed integer array nums of length n.
    //nums contains a valid split at index i if the following are true:
    //    The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
    //    There is at least one element to the right of i. That is, 0 <= i < n - 1.
    //Return the number of valid splits in nums.

    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        long leftSum = 0;
        int count = 0;
        for(int n : nums) sum+=n;
        for(int i=0; i<nums.length-1; i++){
            leftSum += nums[i];
            if(sum-leftSum <= leftSum) count++;
        }
        return count;
    }
}
