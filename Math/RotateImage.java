package Math;

import java.util.Arrays;

public class RotateImage {
    //https://leetcode.com/problems/rotate-image
    //You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    //You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
    //DO NOT allocate another 2D matrix and do the rotation.
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
        String result = "[ ";
        for(int i=0; i<matrix.length; i++){
            result+=" "+Arrays.toString(matrix[i]);
        }
        System.out.println(result+" ]");
    }
    static void rotate(int[][] matrix) {
        int n =matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<n; i++){
            for(int j = 0; j<n/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

    }
}
