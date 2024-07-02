package Hash_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
    // https://leetcode.com/problems/intersection-of-two-arrays-ii/
    // Given two integer arrays nums1 and nums2, return an array of their intersection.
    // Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        for(int n : nums1) map.put(n,map.getOrDefault(n,0)+1);
        for(int n : nums2){
            if(map.containsKey(n) && map.get(n) > 0){
                result.add(n);
                map.put(n,map.get(n)-1);
            }
        }
        int[] array = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            array[i] = result.get(i);
        }

        return array;
    }
}
