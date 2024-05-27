package Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
    // You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
    //Notice that x does not have to be an element in nums.
    //Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
    public int specialArray(int[] nums) {
        for(int x=0; x<=nums.length; x++){
            if(x == countGreaterOrEqual(nums,x)) return x;
        }
        return -1;
    }
    public int countGreaterOrEqual(int[] nums, int x){
        int count = 0;
        for(int n : nums){
            if(n >= x) count++;
        }
        return count;
    }
}
