package BinarySearchAlgorithm;

import java.util.Arrays;

public class Searcha2DMatrixII {
    //https://leetcode.com/problems/search-a-2d-matrix-ii/
    //Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
    //This matrix has the following properties:
    // Integers in each row are sorted in ascending from left to right.
    // Integers in each column are sorted in ascending from top to bottom.
    public static void main(String[] args) {
        int[][] matrix = {{-1,3}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }

    static boolean searchMatrix(int[][] matrix, int target){
        //start the search from the first row and last column
        int r = 0;
        int c = matrix[r].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return true;
            }
            if (matrix[r][c] > target){
                //all the elements in column c are greater than the target
                c--;
            }else{
                // all the elements oin row r are smaller than the target
                r++;
            }
        }
        return false;
    }
}

