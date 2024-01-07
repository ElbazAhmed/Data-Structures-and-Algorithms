package Sorting_algorithms.Cyclic_Sort;

import java.util.Arrays;

public class SetMismatch {
    //https://leetcode.com/problems/set-mismatch/
    //You have a set of integers s, which originally contains all the numbers from 1 to n.
    //Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
    //which results in repetition of one number and loss of another number.
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(setMismatch(nums)));
    }

    static int[] setMismatch(int[] nums){
        //sort the array using cyclic sort
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                //if the element exist already in its exact position it means that is duplicated
                if (nums[nums[i]-1]==nums[i]) {
                    i++;
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
        //now every index should contain the element index incremented by 1
        for(int j=0; j<nums.length; j++){
            //if an element is not in its exact place its duplicated and it take the place of the missing element
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
