package Arrays;
import java.util.Arrays;
public class SpiralMatrixII {
    // https://leetcode.com/problems/spiral-matrix-ii/
    // Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
    public int[][] generateMatrix(int n) {
        int val = 1;
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(matrix[i],-1);
        }
        int[][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}}; // right,down,left,up
        int i=0;
        int j=0;
        int dir = 0;
        while(val <= n*n){
            matrix[i][j] = val++;
            int nextI = i+dirs[dir][0];
            int nextJ = j+dirs[dir][1];
            if(nextI < 0 || nextI >= n || nextJ < 0 || nextJ >= n || matrix[nextI][nextJ] != -1){
                dir++;
                dir%=4;
                i+=dirs[dir][0];
                j+=dirs[dir][1];
            }else{
                i = nextI;
                j = nextJ;
            }
        }
        return matrix;
    }
}
