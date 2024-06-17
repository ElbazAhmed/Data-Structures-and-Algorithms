package Math;

public class SumofSquareNumbers {
    // https://leetcode.com/problems/sum-of-square-numbers/
    // Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            long a2 = i * i;
            double b = Math.sqrt(c - a2);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
