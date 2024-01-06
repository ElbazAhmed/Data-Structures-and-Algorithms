package Sorting_algorithms.Cyclic_Sort;

import java.util.Arrays;

public class FindtheDuplicateNumber {
    //https://leetcode.com/problems/find-the-duplicate-number/
    //Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    //There is only one repeated number in nums, return this repeated number.
    public static void main(String[] args) {
        int[] nums ={2,1,1};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            //each element of the array should be equal to its index incremented by 1
            if(nums[i]!=i+1){
                //if the element we are in exist also in its correct position it means it is the duplicate number
                if (nums[nums[i]-1]==nums[i]) {
                    return nums[i];
                }
                else{
                    int temp=nums[i];
                    nums[i]=nums[temp-1];
                    nums[temp-1]=temp;
                }
            }else{
                i++;
            }
        }
        return -1;
    }


}
