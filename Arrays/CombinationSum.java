package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    // https://leetcode.com/problems/combination-sum/
    // Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
    // You may return the combinations in any order.
    //The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency
    //of at least one of the chosen numbers is different.
    //The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combinations(candidates,0,new ArrayList<Integer>(),target,result);
        return result;
    }

    public void combinations(int[] candidates, int start, List<Integer> combination,int target,List<List<Integer>> result){
        if(target > 0){
            for(int i=start; i<candidates.length; i++){
                combination.add(candidates[i]);
                combinations(candidates,i,combination,target-candidates[i],result);
                combination.remove(combination.size()-1);
            }
        }else if(target == 0){
            result.add(new ArrayList<Integer>(combination));
        }
    }
}
