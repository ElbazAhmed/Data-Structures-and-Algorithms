package Bit_Manipulation;

public class MinimizeXOR {
    // https://leetcode.com/problems/minimize-xor/
    // Given two positive integers num1 and num2, find the positive integer x such that:
    //    x has the same number of set bits as num2, and
    //    The value x XOR num1 is minimal.
    //Note that XOR is the bitwise XOR operation.
    //Return the integer x. The test cases are generated such that x is uniquely determined.
    //The number of set bits of an integer is the number of 1's in its binary representation.

    public int minimizeXor(int num1, int num2) {
        int setBits1 = Integer.bitCount(num1);
        int setBits2 = Integer.bitCount(num2);
        int num = num1;
        for(int i=0; i<32; i++){
            if(setBits1 > setBits2 && (num & (1 << i)) != 0){
                num -= (1 << i);
                setBits1--;
            }

            if(setBits1 < setBits2 && (num & (1 << i)) == 0){
                num += (1 << i);
                setBits1++;
            }
        }

        return num;
    }
}
