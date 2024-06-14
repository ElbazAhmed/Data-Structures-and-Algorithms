package Bit_Manipulation;

public class ConcatenationofConsecutiveBinaryNumbers {
    // https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
    // Given an integer n, return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 109 + 7.

    public int concatenatedBinary(int n) {
        long result = 0;
        long MOD = 1000000007L;
        int bitLength = 0;
        for(int i=1; i<=n; i++){
            if((i & (i-1)) == 0) bitLength++;
            result = ((result<<bitLength) +i)%MOD;
        }
        return  (int) result;
    }
}
