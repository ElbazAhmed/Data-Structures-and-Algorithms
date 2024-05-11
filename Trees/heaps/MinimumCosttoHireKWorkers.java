package Trees.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumCosttoHireKWorkers {
    // https://leetcode.com/problems/minimum-cost-to-hire-k-workers
    // There are n workers. You are given two integer arrays quality and wage where quality[i] is the quality of the ith worker and wage[i] is the minimum wage expectation for the ith worker.
    //We want to hire exactly k workers to form a paid group. To hire a group of k workers, we must pay them according to the following rules:
    //    Every worker in the paid group must be paid at least their minimum wage expectation.
    //    In the group, each worker's pay must be directly proportional to their quality. This means if a worker’s quality is double that of another worker in the group, then they must be paid twice as much as the other worker.
    //Given the integer k, return the least amount of money needed to form a paid group satisfying the above conditions. Answers within 10-5 of the actual answer will be accepted.

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
        List<double[]> ratio = new ArrayList<double[]>();
        for(int i=0; i<n; i++){
            double[] wageQuality = new double[]{1.0*quality[i],(double) wage[i]/quality[i]};
            ratio.add(wageQuality);
        }
        Collections.sort(ratio, (a, b) -> Double.compare(a[1],b[1]));
        double result = 0.0;
        double min = Double.MAX_VALUE;
        for(double[] e : ratio){
            pq.offer(e[0]);
            result += e[0];
            if(pq.size() > k){
                result -= pq.poll();
            }
            if(pq.size() == k){
                min = Math.min(result*e[1],min);
            }
        }
        return min;
    }
}
