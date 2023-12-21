package BinarySearchAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        //sorted Array
        int[] arr ={-6, 5, 45, 86, 470, 980};
        int target = 45;
        System.out.println(binarySearch(arr, target));
    }

    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
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
}
