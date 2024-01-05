package Sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-32,-9,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=arr.length-i;
            //index of the max element in the subarray
            int max=arr[max(arr,j)];
            //put the max element in the last index of the subarray
            arr[max(arr,j)]=arr[j-1];
            arr[j-1]=max;
        }
    }
    static int max(int[] arr,int end){
        int max=0;
        for(int i=0;i<end;i++){
            if (arr[i] > arr[max]) {
                max=i;
            }
        }
        return max;
    }
}
