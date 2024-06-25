package Arrays;

public class ToeplitzMatrix {
    // https://leetcode.com/problems/toeplitz-matrix/
    // Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
    //A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
