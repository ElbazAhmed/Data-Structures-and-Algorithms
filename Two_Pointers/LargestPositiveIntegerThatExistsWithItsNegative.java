package Two_Pointers;

import java.util.Arrays;
public class LargestPositiveIntegerThatExistsWithItsNegative {
    // https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative
    // Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
    //Return the positive integer k. If there is no such integer, return -1.

    public int findMaxK(int[] nums) {
        if(nums.length < 2){
            return -1;
        }
        nums = mergeSort(nums);
        int left = 0;
        int right = nums.length-1;
        while(nums[left] < 0 && nums[right] > 0){
            if(nums[left] == -1*nums[right]){
                return nums[right];
            }
            right--;
            if(nums[right] < 0){
                left++;
                right = nums.length-1;
            }
        }
        return -1;
    }
    public int[] mergeSort(int[] nums){
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);

    }

    public int[] merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }
}
