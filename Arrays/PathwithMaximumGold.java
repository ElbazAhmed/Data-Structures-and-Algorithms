package Arrays;

public class PathwithMaximumGold {
    // https://leetcode.com/problems/path-with-maximum-gold/
    // In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.
    // Return the maximum amount of gold you can collect under the conditions:
    //    Every time you are located in a cell you will collect all the gold in that cell.
    //    From your position, you can walk one step to the left, right, up, or down.
    //    You can't visit the same cell more than once.
    //    Never visit a cell with 0 gold.
    //    You can start and stop collecting gold from any position in the grid that has some gold.
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxGold = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] != 0){
                    maxGold = Math.max(getMaximumGold(grid,i,j,0),maxGold);
                }
            }
        }
        return maxGold;
    }
    public int getMaximumGold(int[][] grid, int i, int j, int sum){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j] == 0 || grid[i][j] > 100){
            return sum;
        }
        sum += grid[i][j];
        grid[i][j] += 110;
        int max = 0;
        max = Math.max(max,getMaximumGold(grid,i-1,j,sum));
        max = Math.max(max,getMaximumGold(grid,i+1,j,sum));
        max = Math.max(max,getMaximumGold(grid,i,j-1,sum));
        max = Math.max(max,getMaximumGold(grid,i,j+1,sum));
        grid[i][j] -= 110;
        return max;
    }
}
