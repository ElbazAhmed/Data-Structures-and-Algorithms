package Hash_Table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoArrays {
    // https://leetcode.com/problems/intersection-of-two-arrays/
    // Given two integer arrays nums1 and nums2, return an array of their intersection
    // Each element in the result must be unique and you may return the result in any order.
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int n : nums1) set.add(n);
        for(int n : nums2){
            if(set.contains(n)){
                list.add(n);
                set.remove(n);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
