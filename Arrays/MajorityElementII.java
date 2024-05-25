package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    // https://leetcode.com/problems/majority-element-ii/
    // Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
    //Follow up: Could you solve the problem in linear time and in O(1) space?
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        int n = nums.length;
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3) {
            result.add(candidate2);
        }
        return result;
    }
}
