package Bit_Manipulation;

public class SingleNumberIII {
    // https://leetcode.com/problems/single-number-iii/
    // Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
    // Find the two elements that appear only once. You can return the answer in any order.
    //You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
    public int[] singleNumber(int[] nums) {
        int aXORb = 0;
        for(int i=0; i<nums.length; i++){
            aXORb^=nums[i];
        }
        int bit = aXORb & ~(aXORb-1);
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            if((nums[i] & bit) == 0){
                xor^=nums[i];
            }
        }
        return new int[]{xor,aXORb^xor};
    }
}
