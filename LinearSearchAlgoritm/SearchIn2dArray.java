package LinearSearchAlgoritm;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5,9,7},
                {4,8,6,2},
                {77,3,86}
        };
        int target = 6;
        System.out.println(Arrays.toString(Seach2d(arr,target)));
    }

    static int[] Seach2d(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if(element == target ){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
