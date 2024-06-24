package Bit_Manipulation;

public class MinimumNumberofKConsecutiveBitFlips {
    // https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/
    // You are given a binary array nums and an integer k.
    //A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.
    //Return the minimum number of k-bit flips required so that there is no 0 in the array. If it is not possible, return -1.
    //A subarray is a contiguous part of an array.

    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int flipCount = 0;
        int[] flip = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (i + k < n) {
                flipCount ^= flip[i + k];
            }

            if ((nums[i] ^ flipCount) == 0) {
                if (i < k - 1) return -1;
                flipCount ^= 1;
                flip[i] = 1;
                count++;
            }
        }

        return count;
    }
}
