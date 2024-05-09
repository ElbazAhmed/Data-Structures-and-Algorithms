package Arrays;

import java.util.Arrays;
public class MaximizeHappinessofSelectedChildren {
    // https://leetcode.com/problems/maximize-happiness-of-selected-children/
    // You are given an array happiness of length n, and a positive integer k.
    //There are n children standing in a queue, where the ith child has happiness value happiness[i]. You want to select k children from these n children in k turns.
    //In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1.
    // Note that the happiness value cannot become negative and gets decremented only if it is positive.
    //Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int j = 0;
        long max = 0;
        for(int i=n-1; i>=0; i--){
            happiness[i] = happiness[i]-j < 0 ? 0 : happiness[i]-j;
            max += happiness[i];
            j++;
            if(j == k){
                break;
            }
        }

        return max;
    }
}
