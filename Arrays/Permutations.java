package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // https://leetcode.com/problems/permutations/
    // Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        permute(nums,list,new ArrayList<Integer>());
        return list;
    }
    public void permute(int[] nums,List<List<Integer>> list,List<Integer> permutation){
        if(permutation.size() == nums.length){
            list.add(new ArrayList<Integer>(permutation));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 100) continue;
            permutation.add(nums[i]);
            nums[i] += 110; // -10 <= nums[i] <= 10 mark nums[i] as used
            permute(nums,list,permutation);
            nums[i] -= 110;
            permutation.remove(permutation.size()-1);
        }

    }

}
