package Bit_Manipulation;

public class CountTripletsThatCanFormTwoArraysofEqualXOR {
    // https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
    // Given an array of integers arr.
    //We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
    //Let's define a and b as follows:
    //    a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
    //    b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
    //Note that ^ denotes the bitwise-xor operation.
    //Return the number of triplets (i, j and k) Where a == b.

    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        int[] prefixXor = new int[n+1];
        int preXor = 0;
        for (int i = 0; i < n; i++) {
            preXor ^= arr[i];
            prefixXor[i + 1] = preXor;
        }
        for(int j=1; j<n; j++){
            for(int k = j+1; k<=n; k++){
                if ((prefixXor[k]^prefixXor[j-1]) == 0) {
                    count+=(k-j);
                }
            }
        }
        return count;
    }
}
