package Sorting_algorithms;

import java.util.Arrays;

public class CyclicSort {
    //given an array of number from 1 to N that is not sorted
    //we sort them using the cyclic sort
    public static void main(String[] args) {
        int[] arr ={3,5,6,2,1,7,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length) {
            //if the element i is not in its correct position that is i+1 we swap it with the element that is in its correct position
            if (arr[i] != i+1) {
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }else{
                //the element i is now in its correct position
                i++;
            }

        }
    }
}
