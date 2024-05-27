package DP;

import java.util.Arrays;
public class MinimumPathSum {
    // https://leetcode.com/problems/minimum-path-sum/
    // Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
    //Note: You can only move either down or right at any point in time.

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return minPathSum(grid,dp,0,0);
    }
    public int minPathSum(int[][] grid,int[][] dp, int down, int right){
        if(dp[down][right] != -1) return dp[down][right];
        if(down == dp.length-1 && right == dp[0].length-1){
            return grid[down][right];
        }
        if(down == dp.length-1){
            dp[down][right] = grid[down][right] + minPathSum(grid,dp,down,right+1);
            return dp[down][right];
        }
        if(right == dp[0].length-1){
            dp[down][right] = grid[down][right] + minPathSum(grid,dp,down+1,right);
            return dp[down][right];
        }

        int downPath = grid[down][right] + minPathSum(grid,dp,down+1,right);
        int rightPath = grid[down][right] + minPathSum(grid,dp,down,right+1);
        dp[down][right] = Math.min(downPath,rightPath);
        return  dp[down][right];
    }
}
