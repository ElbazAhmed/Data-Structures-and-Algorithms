package Sliding_Window;

public class SubarrayProductLessThanK {
    // https://leetcode.com/problems/subarray-product-less-than-k/
    // Given an array of integers nums and an integer k,
    // return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int count = 0;
        long product = 1;
        int left = 0;
        for(int i=0; i<nums.length; i++){
            product *= nums[i];

            while(product >= k){
                product/=nums[left++];
            }

            count+=i-left+1;
        }
        return count;
    }
}
