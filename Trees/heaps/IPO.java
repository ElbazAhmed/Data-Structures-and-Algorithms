package Trees.heaps;

import java.util.PriorityQueue;
import java.util.Arrays;
public class IPO {
    // https://leetcode.com/problems/ipo/
    // You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
    //Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
    //Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
    //The answer is guaranteed to fit in a 32-bit signed integer.

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];
        for(int i=0; i<n; i++){
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        Arrays.sort(projects, (a,b) -> a[0]-b[0]);
        PriorityQueue<Integer> maxProfits = new PriorityQueue<>((a, b) -> b-a);
        int i = 0;
        while(k > 0){
            while(i<n && projects[i][0] <= w){
                maxProfits.offer(projects[i][1]);
                i++;
            }
            if(maxProfits.isEmpty()){
                break;
            }
            w += maxProfits.poll();
            k--;
        }
        return w;
    }
}
