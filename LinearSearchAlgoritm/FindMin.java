package LinearSearchAlgoritm;

public class FindMin {
    public static void main(String[] args) {
        int[] arr ={5, 45, 865, 47, 98, 74};
        System.out.println(min(arr));
    }

    // return the minimum value in the array
    static int min(int[] arr){
        int min = arr[0];
        for (int element : arr) {
            if(element < min){
                min = element;
            }
        }
        return min;
    }
}
