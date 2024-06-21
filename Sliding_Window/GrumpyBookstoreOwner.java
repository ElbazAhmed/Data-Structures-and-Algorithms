package Sliding_Window;

public class GrumpyBookstoreOwner {
    // https://leetcode.com/problems/grumpy-bookstore-owner/
    // There is a bookstore owner that has a store open for n minutes. Every minute, some number of customers enter the store. You are given an integer array customers of length n where customers[i] is the number of the customer that enters the store at the start of the ith minute and all those customers leave after the end of that minute.
    //On some minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.
    //When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise, they are satisfied.
    //The bookstore owner knows a secret technique to keep themselves not grumpy for minutes consecutive minutes, but can only use it once.
    //Return the maximum number of customers that can be satisfied throughout the day.

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int i = 0;
        int curWin = 0;
        int maxWin = 0;

        for(int j=0;j<n;j++) {
            curWin+=customers[j] * grumpy[j];
            maxWin = Math.max(curWin, maxWin);
            if(j >= minutes - 1 ) {
                curWin -= customers[i] * grumpy[i++];
            }
        }
        int res = maxWin;
        for(i=0;i<grumpy.length;i++) {
            res+=customers[i] * (1 - grumpy[i]);
        }
        return res;

    }
}
