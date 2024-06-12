package Arrays;

public class ArrayNesting {
    // https://leetcode.com/problems/array-nesting/
    // You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
    //You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
    //    The first element in s[k] starts with the selection of the element nums[k] of index = k.
    //    The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
    //    We stop adding right before a duplicate element occurs in s[k].
    //Return the longest length of a set s[k].

    public int arrayNesting(int[] nums) {
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != -1){
                int length = 0;
                int currentIndex = nums[i];
                while(nums[currentIndex] != -1){
                    length++;
                    int temp = nums[currentIndex];
                    nums[currentIndex] = -1;
                    currentIndex = temp;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
