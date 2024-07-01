package Trees.heaps;

import java.util.PriorityQueue;

public class ReduceArraySizetoTheHalf {
    //https://leetcode.com/problems/reduce-array-size-to-the-half/
    // You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
    //Return the minimum size of the set so that at least half of the integers of the array are removed.

    public int minSetSize(int[] arr) {
        int max = Integer.MIN_VALUE;
        int length = arr.length;
        for(int n : arr){
            max = Math.max(max,n);
        }
        int[] count = new int[max+1];
        for(int n : arr){
            count[n]++;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> b[1]-a[1]);
        for(int i=0; i<max+1; i++){
            pq.offer(new int[]{i,count[i]});
        }
        int removed = 0;
        int minSize = 0;
        while(removed < length/2 && !pq.isEmpty()){
            removed+=pq.poll()[1];
            minSize++;
        }

        return minSize;
    }
}
