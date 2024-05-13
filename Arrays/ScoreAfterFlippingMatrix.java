package Arrays;

public class ScoreAfterFlippingMatrix {
    // https://leetcode.com/problems/score-after-flipping-matrix
    // You are given an m x n binary matrix grid.
    //A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
    //Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
    //Return the highest possible score after making any number of moves (including zero moves).
    
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxScore = 0;
        for(int i=0; i<m; i++){
            if(grid[i][0] == 0){
                for(int j=0; j<n; j++){
                    grid[i][j] ^= 1;
                }
            }
        }
        for(int j=0; j<n; j++){
            if(morezeros(grid,j)){
                for(int i=0; i<m; i++){
                    grid[i][j] ^= 1;
                }
            }
        }
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                maxScore+=grid[j][i]*Math.pow(2,n-1-i);
            }
        }
        return maxScore;
    }
    public boolean morezeros(int[][] grid,int index){
        int count = 0;
        for(int i=0; i<grid.length; i++){
            if(grid[i][index] == 0){
                count++;
            }
        }
        return count > grid.length/2;
    }
}
