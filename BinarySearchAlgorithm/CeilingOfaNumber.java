package BinarySearchAlgorithm;

public class CeilingOfaNumber {
    //given a sorted array we want to return the index of ceiling number of a given target
    //ceiling number = the smallest element in the array that is greater or equal to the target
    public static void main(String[] args) {
        int[] arr ={2, 3, 5, 9, 16, 22};
        int target = 6;
        System.out.println(ceilingOfaNumber(arr, target));
    }

    static int ceilingOfaNumber(int[] arr, int target){
        // if the target is greater than the greatest element in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int middle = (start +end)/2;
            if(arr[middle] == target){
                return middle;
            } else if (target < arr[middle]) {
                end=middle-1;
            }else if (target > arr[middle]){
                start=middle+1;
            }

        }
        return start;

    }
}
