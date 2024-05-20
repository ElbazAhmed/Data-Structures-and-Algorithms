package Arrays;

public class SumofAllSubsetXORTotals {
    // https://leetcode.com/problems/sum-of-all-subset-xor-totals
    // The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
    //    For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
    //Given an array nums, return the sum of all XOR totals for every subset of nums.
    //Note: Subsets with the same elements should be counted multiple times.
    //An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

    public int subsetXORSum(int[] nums) {
        return subsetsXOR(nums,0,0);
    }
    public int subsetsXOR(int[] nums, int start,int total){
        if(start == nums.length){
            return total;
        }
        return subsetsXOR(nums,start+1,total^nums[start]) + subsetsXOR(nums,start+1,total);
    }
}
