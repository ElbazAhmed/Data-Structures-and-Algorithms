package Bit_Manipulation;

public class FindtheXORofNumbersWhichAppearTwice {
    //https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/
    //You are given an array nums, where each number in the array appears either once or twice.
    //Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.
    
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        boolean[] exit = new boolean[51];
        for(int i=0; i<nums.length; i++){
            if(exit[nums[i]]){
                result^=nums[i];
            }else{
                exit[nums[i]] = true;
            }
        }
        return result;
    }
}
