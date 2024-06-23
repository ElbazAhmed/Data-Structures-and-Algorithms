package Sliding_Window;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit {
    // https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
    // Given an array of integers nums and an integer limit,
    // return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.

    public int longestSubarray(int[] nums, int limit) {
        int maxLength = 0;
        int left = 0;

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (int right = 0; right < nums.length; right++) {
            maxQueue.offer(nums[right]);
            minQueue.offer(nums[right]);

            while (!maxQueue.isEmpty() && !minQueue.isEmpty() && maxQueue.peek() - minQueue.peek() > limit) {
                maxQueue.remove(nums[left]);
                minQueue.remove(nums[left]);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
