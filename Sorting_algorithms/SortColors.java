package Sorting_algorithms;

import java.util.Arrays;

public class SortColors {
    //https://leetcode.com/problems/sort-colors
    //Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
    // with the colors in the order red, white, and blue.
    //We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        int color = 0;
        int index = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==color){
                int temp = nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                index++;
            }
            i++;
            if(i==nums.length){
                color++;
                i=0;
                if(color == 2){
                    break;
                }
            }
        }
    }
}
