package Trees.heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    // https://leetcode.com/problems/top-k-frequent-elements/
    // Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        if(n == 1){
            return nums;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1]-a[1]);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int[] result = new int[k];
        for(int j=0; j<k; j++){
            result[j] = pq.remove()[0];
        }

        return result;
    }
}
