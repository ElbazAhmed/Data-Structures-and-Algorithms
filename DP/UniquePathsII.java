package DP;
import java.util.Arrays;
public class UniquePathsII {
    // https://leetcode.com/problems/unique-paths-ii/
    // You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
    //An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
    //Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Create a memoization array and initialize with -1 (uncomputed).
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        return uniquePathsWithObstacles(obstacleGrid,0,0,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid, int row, int col, int[][] dp){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If out of bounds or there's an obstacle, return 0 paths.
        if (row >= m || col >= n || obstacleGrid[row][col] == 1) {
            return 0;
        }

        // If reached the bottom-right corner, return 1 path.
        if (row == m - 1 && col == n - 1) {
            return 1;
        }

        // If already computed, return the stored value.
        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        // Compute the number of paths from the current cell.
        int rightPaths = uniquePathsWithObstacles(obstacleGrid, row, col + 1, dp);
        int downPaths = uniquePathsWithObstacles(obstacleGrid, row + 1, col, dp);

        // Store the result in the memoization array.
        dp[row][col] = rightPaths + downPaths;

        return dp[row][col];
    }
}
