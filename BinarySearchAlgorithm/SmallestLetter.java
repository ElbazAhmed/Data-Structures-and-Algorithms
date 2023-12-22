package BinarySearchAlgorithm;

public class SmallestLetter {
    //Return the smallest character in letters(that is sorted in non-decreasing order) that is lexicographically greater than target.
    //If such a character does not exist, return the first character in letters.
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(smallestLetter(letters,target));
    }

    static char smallestLetter(char[] letters, char target){
        //if There are no characters in letters that is lexicographically greater than the target, so we return letters[0].
        if (target >= letters[letters.length-1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int middle = (start + end)/2;
            if(target < letters[middle]){
                end=middle-1;
            } else{
                start=middle+1;
            }
        }
        return letters[start];
    }
}
