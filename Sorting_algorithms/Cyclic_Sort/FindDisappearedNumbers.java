package Sorting_algorithms.Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    //Given an array nums of n integers where nums[i] is in the range [1, n],
    //return an array of all the integers in the range [1, n] that do not appear in nums.
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> list = new ArrayList<Integer>();
        //sort the array using cyclic sort
        for (int num : nums) {
            while (nums[num - 1] != num) {
                int temp = nums[num - 1];
                nums[num - 1] = num;
                num = temp;
            }
        }
        //every element should be equal to its index incremented by 1
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }
}
