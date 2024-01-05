package BinarySearchAlgorithm;

public class Searcha2DMatrix {
    //https://leetcode.com/problems/search-a-2d-matrix/
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int target = 1;
        System.out.println(range(matrix,target));
        System.out.println(searchMatrix(matrix,target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int range = range(matrix,target);
        if(range != -1){
            int start = 0;
            int end =matrix[range].length;
            while(start <= end){
                int middle = (start + end)/2;
                if(target < matrix[range][middle]){
                    end=middle-1;
                }else if(target > matrix[range][middle]){
                    start=middle+1;
                }else{
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    static int range(int[][] matrix, int target){
        int start = 0;
        int end =matrix.length-1;
        while(start <= end){
            int middle = (start + end)/2;
            int size = matrix[middle].length;
            if(target > matrix[middle][size-1]){
                start=middle+1;
            }else if(target < matrix[middle][0]){
                end=middle-1;
            }else if(matrix[middle][0] <= target && target <= matrix[middle][size-1]){
                return middle;
            }
        }
        return -1;
    }
}
