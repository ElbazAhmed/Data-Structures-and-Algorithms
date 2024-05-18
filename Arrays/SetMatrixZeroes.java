package Arrays;

public class SetMatrixZeroes {
    // https://leetcode.com/problems/set-matrix-zeroes
    // Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    //You must do it in place.
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean fr = false;
        boolean fc = false;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr == true){
            for(int h=0; h<n; h++){
                matrix[0][h] = 0;
            }
        }
        if(fc == true){
            for(int h=0; h<m; h++){
                matrix[h][0] = 0;
            }
        }



    }
}
