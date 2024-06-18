package Two_Pointers;

import java.util.Arrays;
public class MostProfitAssigningWork {
    // https://leetcode.com/problems/most-profit-assigning-work/
    // You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:
    //    difficulty[i] and profit[i] are the difficulty and the profit of the ith job, and
    //    worker[j] is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty at most worker[j]).
    //Every worker can be assigned at most one job, but one job can be completed multiple times.
    //    For example, if three workers attempt the same job that pays $1, then the total profit will be $3. If a worker cannot complete any job, their profit is $0.
    //Return the maximum profit we can achieve after assigning the workers to the jobs.
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int length = profit.length;
        int[][] jobs = new int[length][2];
        int maxProfit = 0;
        for(int i=0; i<length; i++){
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a,b) -> a[0]-b[0]);
        Arrays.sort(worker);
        int j=0;
        int profitj = 0;
        for(int i=0; i<worker.length; i++){
            while(j<length && jobs[j][0] <= worker[i]){
                profitj = Math.max(profitj,jobs[j][1]);
                j++;
            }
            maxProfit += profitj;
        }
        return maxProfit;
    }
}
