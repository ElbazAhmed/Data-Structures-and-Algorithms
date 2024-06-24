package Two_Pointers;

import java.util.Arrays;
public class FindtheIntegerAddedtoArrayII {
    // https://leetcode.com/problems/find-the-integer-added-to-array-ii/
    // You are given two integer arrays nums1 and nums2.
    //From nums1 two elements have been removed, and all other elements have been increased (or decreased in the case of negative) by an integer, represented by the variable x.
    //As a result, nums1 becomes equal to nums2. Two arrays are considered equal when they contain the same integers with the same frequencies.
    //Return the minimum possible integer x that achieves this equivalence.

    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int minDiff = Integer.MAX_VALUE;
        int count = 0;

        for (int i=0; i<nums1.length; i++) {
            int index1 = i;
            int index2 = 0;
            int diff = nums2[index2]-nums1[index1];
            count = 0;

            while(index1 < nums1.length && index2 < nums2.length){
                if(nums2[index2] - nums1[index1] == diff){
                    index1 ++;
                    index2 ++;
                    count ++;
                }
                else index1 ++;
            }

            if(count == nums2.length){
                minDiff = Math.min(minDiff,diff);
            }
        }

        return minDiff;
    }
}
