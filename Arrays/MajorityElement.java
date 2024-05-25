package Arrays;

public class MajorityElement {
    // https://leetcode.com/problems/majority-element/
    // Given an array nums of size n, return the majority element.
    //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    // Follow-up: Could you solve the problem in linear time and in O(1) space?

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int n : nums){
            if(count == 0){
                candidate = n;
                count++;
            }else{
                if(candidate == n){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return candidate;
    }
}
