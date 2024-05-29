package Math;

public class SumofDigitDifferencesofAllPairs {
    // https://leetcode.com/problems/sum-of-digit-differences-of-all-pairs/
    // You are given an array nums consisting of positive integers where all integers have the same number of digits.
    //The digit difference between two integers is the count of different digits that are in the same position in the two integers.
    //Return the sum of the digit differences between all pairs of integers in nums.
    public long sumDigitDifferences(int[] nums) {
        long sumDigitDifferences = 0;
        int n = nums.length;
        int[][] digitFrequency = new int[10][10];
        for(int i=0; i<n; i++){
            int num = nums[i];
            int position = 0;
            while(num > 0){
                digitFrequency[num%10][position++]++;
                num/=10;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sumDigitDifferences += digitFrequency[i][j]*(n-digitFrequency[i][j]);
            }
        }
        return sumDigitDifferences/2;
    }
}
