package Sorting_algorithms;

import java.util.Arrays;

public class SortArrayByParity {
    //https://leetcode.com/problems/sort-array-by-parity/
    //Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            //every time we find an ood number we put it in the j index and incremented then by 1
            if(nums[i]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return nums;
    }
}
