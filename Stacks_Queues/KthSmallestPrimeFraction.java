package Stacks_Queues;

import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {
    // https://leetcode.com/problems/k-th-smallest-prime-fraction
    // You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique. You are also given an integer k.
    //For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].
    //Return the kth smallest fraction considered. Return your answer as an array of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    double x = (double) a[0]/(a[1]);
                    double y = (double) b[0]/(b[1]);
                    return x > y? -1 : 1;
                }
        );
        int n = arr.length;
        int first = 0;
        int second = 1;
        while(first != n-1){
            pq.offer(new int[]{arr[first],arr[second]});
            if (pq.size() > k) {
                pq.poll();
            }
            second++;
            if(second == n){
                first++;
                second = first+1;
            }
        }
        return pq.poll();
    }
}
