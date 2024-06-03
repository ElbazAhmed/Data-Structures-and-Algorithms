package DP;

public class HouseRobber {
    // https://leetcode.com/problems/house-robber/
    // You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
    // the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
    //Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        for(int n : nums){
            int temp = Math.max(n+rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
