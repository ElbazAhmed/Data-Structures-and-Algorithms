package Bit_Manipulation;

public class MinimumFlipstoMakeAorBEqualtoC {
    // https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
    // Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
    //Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.

    public int minFlips(int a, int b, int c) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;

            if (bitC == 0) {
                count += bitA + bitB;
            } else {
                if (bitA == 0 && bitB == 0) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
