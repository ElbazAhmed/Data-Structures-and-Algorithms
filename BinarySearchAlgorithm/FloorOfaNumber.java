package BinarySearchAlgorithm;

public class FloorOfaNumber {
    //given a sorted array we want to return the index the floor number of a given target
    //floor number = the greatest element in the array that is smaller or equal to the target
    public static void main(String[] args) {
        int[] arr ={2, 3, 5, 9, 16, 22};
        int target = 1;
        System.out.println(floorOfaNumber(arr, target));
    }

    static int floorOfaNumber(int[] arr, int target){
        // if the target is smaller than the smallest element in the array
        if(target < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int middle = (start +end)/2;

            if (target < arr[middle]) {
                end=middle-1;
            }else if (target > arr[middle]){
                start=middle+1;
            }else{
                return middle;
            }

        }
        return end;

    }
}
