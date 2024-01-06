package Sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,-1,0,4,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        //at every iteration we sort the array till the j index
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                //we put the j element of the array in its exact position in the left subarray
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    //if the j element is greater than the j-1 element it means that is greater than all the elements
                    //of the left subarray
                    break;
                }
            }
        }
    }
}
