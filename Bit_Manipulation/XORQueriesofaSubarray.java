package Bit_Manipulation;

public class XORQueriesofaSubarray {
    // https://leetcode.com/problems/xor-queries-of-a-subarray/
    // You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti].
    //For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ).
    //Return an array answer where answer[i] is the answer to the ith query.

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int q = queries.length;
        int[] answer = new int[q];
        int[] prefixXor = new int[n];
        prefixXor[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixXor[i] = arr[i]^prefixXor[i-1];
        }

        for(int i=0; i<q; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            answer[i] = prefixXor[right] ^ (left > 0 ? prefixXor[left - 1] : 0);
        }

        return answer;
    }
}
