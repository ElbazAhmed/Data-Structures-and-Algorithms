package BinarySearchAlgorithm;

public class FindMinimuminRotatedSortedArray {
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
    //Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
    //Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
    //Given the sorted rotated array nums of unique elements, return the minimum element of this array.
    //You must write an algorithm that runs in O(log n) time.
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        //first find the pivot element then return the next element
        while(start < end){
            int middle = (start + end)/2;
            if (middle < end && arr[middle] > arr[middle+1]) {
                return arr[middle+1];
            }
            if (middle > start && arr[middle] < arr[middle-1]) {
                return arr[middle];
            }else if (arr[middle] <= arr[0]) {
                end=middle-1;
            } else if (arr[middle] > arr[0]) {
                start=middle+1;
            }
        }
        //if the pivot element doesn't exist it means that the array is not rotated
        //then we return the first element in the array (sorted in ascending order)
        return arr[0];
    }
}
