package Arrays;

public class FindtheIntegerAddedtoArrayI {
    // https://leetcode.com/problems/find-the-integer-added-to-array-i/
    // You are given two arrays of equal length, nums1 and nums2.
    //Each element in nums1 has been increased (or decreased in the case of negative) by an integer, represented by the variable x.
    //As a result, nums1 becomes equal to nums2. Two arrays are considered equal when they contain the same integers with the same frequencies.
    //Return the integer x.

    public int addedInteger(int[] nums1, int[] nums2) {
        int length = nums1.length;
        int max2 = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        for(int i=0; i<length; i++){
            max1 = Math.max(nums1[i],max1);
            max2 = Math.max(nums2[i],max2);
        }

        return max2-max1;
    }
}
