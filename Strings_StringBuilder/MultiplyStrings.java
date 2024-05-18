package Strings_StringBuilder;

public class MultiplyStrings {
    // https://leetcode.com/problems/multiply-strings/
    // Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
    //Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m+n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int sum = product + result[pos2];

                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int num : result){
            if(!(str.length() == 0 && num == 0)){
                str.append(num);
            }
        }
        return str.length() == 0 ? "0" : str.toString();
    }
}
