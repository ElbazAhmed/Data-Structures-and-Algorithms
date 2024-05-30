package Arrays;

public class SpecialArrayII {
    // https://leetcode.com/problems/special-array-ii/
    // An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
    //You are given an array of integer nums and a 2D integer matrix queries, where for queries[i] = [fromi, toi] your task is to check that
    //subarray nums[fromi toi] is special or not.
    //Return an array of booleans answer such that answer[i] is true if nums[fromi..toi] is special.
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] result = new boolean[queries.length];
        int[] prefixSum = new int[n+1];
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1];
            if(nums[i-1]%2 == nums[i]%2){
                prefixSum[i]++;
            }
        }
        for(int j=0; j<queries.length; j++){
            int start = queries[j][0];
            int end = queries[j][1];
            result[j] = prefixSum[end]-prefixSum[start] > 0 ? false : true;
        }
        return result;
    }
}
