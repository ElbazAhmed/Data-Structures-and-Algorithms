package Arrays;

public class MinimumSizeSubarraySum {
    // https://leetcode.com/problems/minimum-size-subarray-sum/
    // Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
    //whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
