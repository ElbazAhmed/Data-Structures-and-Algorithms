package Arrays;

import java.util.HashMap;

public class MaxSumofaPairWithEqualSumofDigits {
    // https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/
    // You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j,
    // and the sum of digits of the number nums[i] is equal to that of nums[j].
    //Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions.
    
    public int maximumSum(int[] nums) {
        int maxSum = -1;
        HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
        for (int num : nums) {
            int sum = sumDigits(num);
            int[] topTwo = map.computeIfAbsent(sum, k -> new int[]{-1, -1});

            // Update the two largest values for the current sum
            if (num > topTwo[0]) {
                topTwo[1] = topTwo[0];
                topTwo[0] = num;
            } else if (num > topTwo[1]) {
                topTwo[1] = num;
            }
        }

        // Calculate the maximum sum of pairs
        for (int[] topTwo : map.values()) {
            if (topTwo[1] != -1) {  // Ensure there are at least two elements
                maxSum = Math.max(maxSum, topTwo[0] + topTwo[1]);
            }
        }

        return maxSum;
    }

    public int sumDigits(int num){
        int sum = 0;
        while(num > 0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
