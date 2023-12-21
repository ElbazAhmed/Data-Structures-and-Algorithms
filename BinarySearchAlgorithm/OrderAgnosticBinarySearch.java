package BinarySearchAlgorithm;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //sorted Array
        //int[] arr ={-6, 5, 45, 86, 470, 980};
        int[] arr ={450, 140, 70, 45, -6, -10};
        int target = -6;
        System.out.println(binarySearch(arr, target));
    }

    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //check if the Array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int middle = (start + end)/2;
            if(target == arr[middle]){
                return middle;
            }
            if(isAsc){
                if(target < arr[middle]){
                    end=middle-1;
                } else {
                    start=middle+1;
                }
            }else{
                if(target > arr[middle]){
                    end=middle-1;
                } else {
                    start=middle+1;
                }
            }

        }
        return -1;
    }
}
