package Sorting_algorithms.Cyclic_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesinanArray {
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/
    //Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice,
    //return an array of all the integers that appears twice.
    //You must write an algorithm that runs in O(n) time and uses only constant extra space.
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(nums));
    }

    static List<Integer> findAllDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        //sort the array using the cyclic sort
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                //if the element we are in exist already in its position exact it means duplicate
                if (nums[nums[i]-1]==nums[i]) {
                    i++;
                }
                //else we put the element in its position exact
                else{
                    int temp=nums[i];
                    nums[i]=nums[temp-1];
                    nums[temp-1]=temp;
                }
            }else{
                i++;
            }
        }
        //in this step all the element should be in its position exact if not it means duplicated
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1) {
                list.add(nums[j]);
            }
        }
        return list;
    }
}
