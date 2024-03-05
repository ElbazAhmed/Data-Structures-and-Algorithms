package Bit_Manipulation;

public class RangeBitwiseAnd {
    //https://leetcode.com/problems/bitwise-and-of-numbers-range
    //Given two integers left and right that represent the range [left, right],
    // return the bitwise AND of all numbers in this range, inclusive.

    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left,right));
    }

    static int rangeBitwiseAnd(int left, int right) {
        while(right>left){
            right = right & (right - 1);
        }
        return right;
    }
}
