package Sorting_algorithms;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{2,6,3,4,7,1,5};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int first, int last){
        if(first >= last){
            return;
        }
        int start = first;
        int end = last;
        int p = start + (end - start)/2;
        int pivot = nums[p];

        while(start < end){
            while(nums[start] < pivot){
                start++;
            }

            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                swap(nums,start,end);
                end--;
                start++;
            }
        }
        sort(nums,first,end);
        sort(nums,start,last);

    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
