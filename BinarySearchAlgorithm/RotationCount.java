package BinarySearchAlgorithm;

public class RotationCount {
    //https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
    //Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right
    //rotated (i.e, the last element will be cyclically shifted to the starting position of the array) k number of times,
    //the task is to find the value of k.

    public static void main(String[] args) {
        int[] arr ={2, 3, 6, 12};
        System.out.println(rotationCount(arr));
    }

    static int rotationCount(int[] arr){
        int start =0;
        int end =arr.length-1;
        //if the array is a normal sorted array
        if (arr[0]<arr[end]) {
            return 0;
        }
        while(start < end){
            int middle = (start + end)/2;
            if (middle<end && arr[middle]>arr[middle+1]) {
                return middle+1;
            }
            if (middle>start && arr[middle]<arr[middle-1]) {
                return middle;
            }
            if (arr[middle]>arr[end]) {
                start=middle+1;
            } else if (arr[middle] <= arr[start]) {
                end=middle-1;
            }
        }
        return 0;
    }
}
