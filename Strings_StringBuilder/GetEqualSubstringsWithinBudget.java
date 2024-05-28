package Strings_StringBuilder;

public class GetEqualSubstringsWithinBudget {
    // https://leetcode.com/problems/get-equal-substrings-within-budget/
    // You are given two strings s and t of the same length and an integer maxCost.
    //You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]|
    // (i.e., the absolute difference between the ASCII values of the characters).
    //Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost.
    // If there is no substring from s that can be changed to its corresponding substring from t, return 0.
    public int equalSubstring(String s, String t, int maxCost) {
        int length = s.length();
        int[] costs = new int[length];

        for (int i = 0; i < length; i++) {
            costs[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int start = 0;
        int currentCost = 0;
        int maxLength = 0;

        for (int end = 0; end < length; end++) {
            currentCost += costs[end];
            while (currentCost > maxCost) {
                currentCost -= costs[start];
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
