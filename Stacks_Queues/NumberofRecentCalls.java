package Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofRecentCalls {
    // https://leetcode.com/problems/number-of-recent-calls
    // You have a RecentCounter class which counts the number of recent requests within a certain time frame.
    //Implement the RecentCounter class:
    //    RecentCounter() Initializes the counter with zero recent requests.
    //    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request).
    //    Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
    //It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.

    class RecentCounter {
        private int recentReq;
        private Queue<Integer> queue = new LinkedList<Integer>();
        public RecentCounter() {
            this.recentReq = 0;
        }

        public int ping(int t) {
            queue.add(t);
            while(queue.peek() < t - 3000){
                queue.remove();
            }
            return queue.size();
        }
    }
}
