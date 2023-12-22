package BinarySearchAlgorithm;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int middle = (start + end)/2;
            if(arr[middle] > arr[middle +1] && arr[middle] > arr[middle -1]){
                return middle;
            }else if(arr[middle] < arr[middle -1]){
                end=middle;
            }else if(arr[middle] < arr[middle +1]){
                start=middle;
            }
        }
        return -1;
    }
}
