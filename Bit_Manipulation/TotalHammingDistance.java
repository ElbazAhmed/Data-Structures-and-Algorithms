package Bit_Manipulation;

public class TotalHammingDistance {
    // https://leetcode.com/problems/total-hamming-distance/
    // The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
    //Given an integer array nums, return the sum of Hamming distances between all the pairs of the integers in nums.

    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int k = 0; k < 32; k++) {
            int countZeros = 0;
            int countOnes = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & (1 << k))!=0)
                    countOnes++;
                else
                    countZeros++;
            }
            result += countOnes * countZeros;
        }
        return result;
    }
}
