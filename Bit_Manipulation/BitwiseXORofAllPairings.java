package Bit_Manipulation;

public class BitwiseXORofAllPairings {
    // https://leetcode.com/problems/bitwise-xor-of-all-pairings/
    // You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers.
    // There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).
    //Return the bitwise XOR of all integers in nums3.
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int xorTotal = 0;
        if(m%2 != 0){
            for(int num : nums2){
                xorTotal^=num;
            }
        }
        if(n%2 != 0){
            for(int num : nums1){
                xorTotal^=num;
            }
        }
        return xorTotal;
    }
}
