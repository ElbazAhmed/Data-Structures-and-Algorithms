package DP;

public class MinCostClimbingStairs {
    // https://leetcode.com/problems/min-cost-climbing-stairs/
    // You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
    //You can either start from the step with index 0, or the step with index 1.
    //Return the minimum cost to reach the top of the floor.
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+2];
        for(int i=n-1; i>=0; i--){
            dp[i] = cost[i] + Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
