package Sorting_algorithms.Cyclic_Sort;

public class FirstMissingPositive {
    //https://leetcode.com/problems/first-missing-positive/
    //Given an unsorted integer array nums, return the smallest missing positive integer.
    //You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        //sort the array using cyclic sort
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                //skip the element if it's not in the range (1,nums.length) or if it's duplicated(exist already ini its exact place)
                if(nums[i]>nums.length || nums[i]<=0 || nums[nums[i]-1]==nums[i]){
                    i++;
                }else{
                    //put the element in its exact place
                    int temp=nums[i];
                    nums[i]=nums[temp-1];
                    nums[temp-1]=temp;
                }
            }else{
                i++;
            }
        }
        //now the first element that's not in its exact index it means that the element index incremented by 1 is the first missing positive
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        //if all the element is in its correct indexes its means that nums.length+1 is the first missing positive
        return nums.length+1;
    }
}
