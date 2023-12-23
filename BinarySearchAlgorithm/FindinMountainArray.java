package BinarySearchAlgorithm;

public class FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(findinMountainArray(arr,target));
    }

    static int findinMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int result = binarySearch(arr,target,0,peak,true);
        if(result != -1){
            return result;
        }else{
            return binarySearch(arr,target,peak,arr.length-1,false);
        }

    }

    static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc){
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
