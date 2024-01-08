package Sorting_algorithms;


import java.util.Arrays;

public class SortArrayByParityII {
    //https://leetcode.com/problems/sort-array-by-parity-ii/
    //Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
    //Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        //try to put all odd numbers in odd indexes
        for(int j=0; j<nums.length; j++){
            int i=0;
            while(nums[j]%2==0 && j%2!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i+=2;
            }
        }
        return nums;
    }
}
