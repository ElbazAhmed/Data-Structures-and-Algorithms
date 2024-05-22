package DP_Memorization;

public class UniquePaths {
    //https://leetcode.com/problems/unique-paths/
    // There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
    //Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
    //The test cases are generated so that the answer will be less than or equal to 2 * 109.
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return uniquePaths(0,0,dp);
    }
    public int uniquePaths(int m, int n, int[][] dp){
        if(dp[m][n] != 0){
            return dp[m][n];
        }
        if(m == dp.length-1 && n == dp[0].length-1){
            return 1;
        }
        if(m == dp.length-1 && n < dp[0].length-1){
            return uniquePaths(m,n+1,dp);
        }
        if(m < dp.length-1 && n == dp[0].length-1){
            return uniquePaths(m+1,n,dp);
        }
        int down = uniquePaths(m+1,n,dp);
        int right = uniquePaths(m,n+1,dp);
        dp[m+1][n] = down;
        dp[m][n+1] = right;
        return down + right;
    }
}
