package BinarySearchAlgorithm;

public class FindElementinInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr={1, 6, 9, 10, 15, 20, 35, 40, 47, 52, 57, 59, 63, 68, 71, 74, 79, 96, 100, 142, 170, 213};
        int target = 20;
        System.out.println(searchIndex(arr,target));
    }

    static int searchIndex(int[] arr, int target){
        int start = 0;
        int end = 1;
        //find the range
        while(target > arr[end]) {
            //double the box size
            int newStart=end+1;
            //end = end + size of the privious box *2
            end = end + (end - start +1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int middle=(start + end)/2;
            if(target < arr[middle]){
                end=middle-1;
            }else if(target > arr[middle]){
                start=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
