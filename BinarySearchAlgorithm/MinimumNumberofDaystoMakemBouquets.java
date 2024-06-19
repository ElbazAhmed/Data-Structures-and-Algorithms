package BinarySearchAlgorithm;

public class MinimumNumberofDaystoMakemBouquets {
    // https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
    // You are given an integer array bloomDay, an integer m and an integer k.
    //You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
    //The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
    //Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.

    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = (int) 1e9;
        int result = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            int consecutive = 0;
            int bouquets = 0;

            for(int i=0; i<bloomDay.length; i++){
                if(bloomDay[i] <= mid){
                    consecutive++;
                    if(consecutive >= k){
                        consecutive = 0;
                        bouquets++;
                    }
                }
                else {
                    consecutive = 0;
                }
            }
            if(bouquets >= m){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;

    }
}
