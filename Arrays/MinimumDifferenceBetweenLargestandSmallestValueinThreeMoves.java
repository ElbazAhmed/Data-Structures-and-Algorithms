package Arrays;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {
    // https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
    // You are given an integer array nums.
    //In one move, you can choose one element of nums and change it to any value.
    //Return the minimum difference between the largest and smallest value of nums after performing at most three moves.

    public int minDifference(int[] nums) {
        int length = nums.length;
        if(length <= 4){
            return 0;
        }
        Arrays.sort(nums);
        int start = 0;
        int end = length-4;
        int result = Integer.MAX_VALUE;
        while(end < length){
            result = Math.min(result,nums[end]-nums[start]);
            start++;
            end++;
        }
        return result;
    }
}
