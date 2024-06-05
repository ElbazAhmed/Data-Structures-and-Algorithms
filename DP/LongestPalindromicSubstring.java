package DP;

public class LongestPalindromicSubstring {
    //Given a string s, return the longest palindromic substring in s.

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int length = s.length();
        int[][] dp = new int[length][length];
        String maxPal = "";

        for (int end = 0; end < length; end++) {
            for (int start = end; start >= 0; start--) {
                if (s.charAt(start) == s.charAt(end)) {
                    if (end - start <= 2 || dp[start + 1][end - 1] == 1) {
                        dp[start][end] = 1;
                        if (end - start + 1 > maxPal.length()) {
                            maxPal = s.substring(start, end + 1);
                        }
                    }
                }
            }
        }
        return maxPal;
    }
}
