package Arrays;

import java.util.HashMap;

public class SubarraySumsDivisiblebyK {
    // https://leetcode.com/problems/subarray-sums-divisible-by-k/
    // Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
    //A subarray is a contiguous part of an array.
    public int subarraysDivByK(int[] nums, int k) {
        int length = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) {
                remainder += k;
            }
            count += map.getOrDefault(remainder, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
