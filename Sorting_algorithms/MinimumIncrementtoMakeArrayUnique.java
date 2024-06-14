package Sorting_algorithms;

public class MinimumIncrementtoMakeArrayUnique {
    // https://leetcode.com/problems/minimum-increment-to-make-array-unique/
    // You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
    //Return the minimum number of moves to make every value in nums unique.
    //The test cases are generated so that the answer fits in a 32-bit integer.

    public int minIncrementForUnique(int[] nums) {
        int maxValue = 0;
        int length = nums.length;
        for (int n : nums) {
            maxValue = Math.max(maxValue, n);
        }
        int[] frequency = new int[maxValue + length];
        for (int n : nums) {
            frequency[n]++;
        }
        int moves = 0;
        for (int i = 0; i < maxValue + length; i++) {
            if (frequency[i] > 1) {
                int extra = frequency[i] - 1;
                frequency[i + 1] += extra;
                moves += extra;
            }
        }

        return moves;
    }
}
