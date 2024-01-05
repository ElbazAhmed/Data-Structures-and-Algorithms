package Sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,-32,-9,33,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swap = false;
        for(int i=0;i<arr.length;i++){
            //for each step max will take it's perfect place
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]) {
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                    swap=true;
                }
            }
            //if no swap take place in the first iteration it means that the array is already sorted
            if(swap == false){
                break;
            }
        }
    }
}
