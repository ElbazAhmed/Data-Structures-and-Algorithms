package Trees.heaps;

import java.util.PriorityQueue;
import java.util.Arrays;

public class DivideIntervalsIntoMinimumNumberofGroups {
    // https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/

    public int minGroups(int[][] intervals) {
        if (intervals.length == 1) return 1;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (!pq.isEmpty() && pq.peek() < interval[0]) {
                pq.poll();
            }
            pq.add(interval[1]);
        }

        return pq.size();
    }
}
