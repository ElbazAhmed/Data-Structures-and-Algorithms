package Bit_Manipulation;

public class SumofTwoIntegers {
    // https://leetcode.com/problems/sum-of-two-integers/
    // Given two integers a and b, return the sum of the two integers without using the operators + and -.

    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
}
