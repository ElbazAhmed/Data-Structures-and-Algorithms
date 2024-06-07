package DP;
import java.util.Arrays;
public class LongestIncreasingSubsequence {
    // https://leetcode.com/problems/longest-increasing-subsequence/
    // Given an integer array nums, return the length of the longest strictly increasing subsequence

    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);

        int maxLength = 1;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
}
