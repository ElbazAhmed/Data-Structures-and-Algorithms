package Two_Pointers;

public class MaximumDistanceBetweenaPairofValues {
    // https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
    // You are given two non-increasing 0-indexed integer arrays nums1 and nums2.
    //A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j].
    // The distance of the pair is j - i.
    //Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.
    //An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.

    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int j=0;
        for(int i=0; i<length1; i++){
            while(j<length2 && nums1[i] <= nums2[j]){
                maxDistance = Math.max(maxDistance, j-i);
                j++;
            }
        }
        return maxDistance;
    }
}
