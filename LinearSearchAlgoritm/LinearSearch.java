package LinearSearchAlgoritm;

public class LinearSearch {

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // check element of every index if it's = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // target not found
        return -1;

    }

    public static void main(String[] args) {
        int[] arr ={5, 45, 865, 47, 98, 74};
        int target = 865;
        System.out.println(linearSearch(arr, target));
    }
}
