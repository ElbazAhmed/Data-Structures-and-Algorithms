package Bit_Manipulation;

public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
    // Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:
    //    If the current number is even, you have to divide it by 2.
    //    If the current number is odd, you have to add 1 to it.
    //It is guaranteed that you can always reach one for all test cases.

    public int numSteps(String s) {
        int carry = 0;
        int n = s.length();
        int count = 0;
        for(int i=n-1; i > 0; i--){
            if(s.charAt(i) - '0' + carry == 1){
                carry = 1;
                count+=2;
            }else{
                count+=1;
            }
        }
        return count+carry;
    }
}
