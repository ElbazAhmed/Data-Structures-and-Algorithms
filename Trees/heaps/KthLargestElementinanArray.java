package Trees.heaps;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    // https://leetcode.com/problems/kth-largest-element-in-an-array/
    //Given an integer array nums and an integer k, return the kth largest element in the array.
    //Note that it is the kth largest element in the sorted order, not the kth distinct element.
    //Can you solve it without sorting?
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n : nums){
            pq.offer(n);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}
