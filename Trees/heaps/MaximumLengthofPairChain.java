package Trees.heaps;

import java.util.PriorityQueue;

public class MaximumLengthofPairChain {
    // https://leetcode.com/problems/maximum-length-of-pair-chain/
    // You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
    //A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
    //Return the length longest chain which can be formed.
    //You do not need to use up all the given intervals. You can select pairs in any order.
    public int findLongestChain(int[][] pairs) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        for(int[] pair : pairs){
            pq.offer(pair);
        }
        for(int i=0; i<pairs.length; i++){
            pairs[i] = pq.poll();
        }
        int longestChain = 0;
        int currentEnd = Integer.MIN_VALUE;

        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) {
                longestChain++;
                currentEnd = pair[1];
            }
        }

        return longestChain;
    }
}
