package Sorting_algorithms.Cyclic_Sort;

import java.util.Arrays;

public class MissingNumber {
    //https://leetcode.com/problems/missing-number/
    //Given an array nums containing n distinct numbers in the range [0, n],
    //return the only number in the range that is missing from the array.
    //Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums){
        //first we sort the array using cyclic sort
        int i = 0 ;
        while(i<nums.length){
            if(nums[i]!=nums.length && nums[i]!=i){
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }else{
                i++;
            }
        }
        //now every element should be equal to its index
        for(int j=0; j<nums.length; j++){
            //if an element is not equal to its index that is the missing number
            if(nums[j]!=j){
                return j;
            }
        }
        //if all the elements in the array are equal to its indexes that means that the missing number is n
        return nums.length;

    }
}
