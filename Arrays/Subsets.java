package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    //https://leetcode.com/problems/subsets/
    //Given an integer array nums of unique elements, return all possible subsets (the power set).
    //The solution set must not contain duplicate subsets. Return the solution in any order.

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listSubsets = new ArrayList<List<Integer>>();
        generateSubSets(nums,0,new ArrayList<Integer>(),listSubsets);
        return listSubsets;
    }
    public void generateSubSets(int[] nums, int start,List<Integer> list, List<List<Integer>> listSubsets){
        listSubsets.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            generateSubSets(nums,i + 1,list,listSubsets);
            list.remove(list.size() - 1);
        }
    }
}
