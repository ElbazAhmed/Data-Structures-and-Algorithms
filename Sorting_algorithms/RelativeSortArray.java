package Sorting_algorithms;

public class RelativeSortArray {
    // https://leetcode.com/problems/relative-sort-array/
    // Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
    //Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
    // Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for (int num : arr1) {
            if (num > max) {
                max = num;
            }
        }
        int[] count = new int[max + 1];
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        for (int num = 0; num <= max; num++) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        return arr1;
    }
}
