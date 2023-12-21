package LinearSearchAlgoritm;

import java.util.Arrays;

public class EvenDigits {
    //Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findDigitsNumbers2(nums));
    }
    static int findDigitsNumbers(int[] nums){
        int evenDigits = 0;
        for (int ele : nums) {
            String str = Integer.toString(ele);
            if(str.length() %2 == 0){
                evenDigits++;
            }
        }
        return evenDigits;
    }

    //Optimized Solution
    static int findDigitsNumbers2(int[] nums){
        int evenDigits = 0;
        for (int ele : nums) {
            int digitsNumber = (int)(Math.log10(ele) + 1);
            if(digitsNumber %2 == 0){
                evenDigits++;
            }
        }
        return evenDigits;
    }
}
