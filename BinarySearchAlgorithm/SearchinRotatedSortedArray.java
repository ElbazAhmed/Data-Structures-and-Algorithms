package BinarySearchAlgorithm;

public class SearchinRotatedSortedArray {
    //https://leetcode.com/problems/search-in-rotated-sorted-array/

    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 1;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int pivotIndex = pivotIndex(arr);
        if(pivotIndex != -1){
            //search in the first ascending part of the array
            int result = binarySearch(arr,target,0,pivotIndex);
            if(result == -1){
                //if not found search in the second ascending part of the array
                result = binarySearch(arr,target,pivotIndex+1,arr.length-1);
            }
            return result;
        }
        //if the pivot element doesn't exist it means that the array is a normal ascending sorted array
        return binarySearch(arr,target,0,arr.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int middle = (start + end)/2;
            if(target < arr[middle]){
                end=middle-1;
            } else if (target > arr[middle]) {
                start=middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    //find the index of the pivot element
    static int pivotIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int middle = (start + end)/2;
            if (middle < end && arr[middle] > arr[middle+1]) {
                return middle;
            }
            if (middle > start && arr[middle] < arr[middle-1]) {
                return middle-1;
            }else if (arr[middle] <= arr[0]) {
                end=middle-1;
            } else if (arr[middle] > arr[0]) {
                start=middle+1;
            }
        }
        return -1;
    }
}
