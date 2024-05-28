package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    // https://leetcode.com/problems/combinations/
    // Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
    //You may return the answer in any order.
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        combine(n,k,1,new ArrayList<Integer>(),list);
        return list;
    }
    public void combine(int n, int k,int start,List<Integer> combination, List<List<Integer>> list){
        if(combination.size() == k){
            list.add(new ArrayList<Integer>(combination));
            return;
        }
        for(int i=start; i<=n; i++){
            combination.add(i);
            combine(n,k,i+1,combination,list);
            combination.remove(combination.size()-1);
        }
    }
}
