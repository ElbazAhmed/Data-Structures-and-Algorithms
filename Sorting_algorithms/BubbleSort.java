package Sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6,2,7,3,-1,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //for each step max will take it's perfect place
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]) {
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
    }
}
