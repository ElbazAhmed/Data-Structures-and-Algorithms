package Dynamic_programming;

import java.util.HashMap;

//https://leetcode.com/problems/n-th-tribonacci-number/
//The Tribonacci sequence Tn is defined as follows:
//T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
//Given n, return the value of Tn.
public class NthTribonacciNumber {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1);
        map.put(n,result);
        return result;
    }
}
