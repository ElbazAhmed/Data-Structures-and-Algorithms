package Strings_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    // https://leetcode.com/problems/palindrome-partitioning/
    // Given a string s, partition s such that every substring of the partition is a palindrome.
    //Return all possible palindrome partitioning of s.
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        partition(s,0,new ArrayList<String>(),result);
        return result;
    }
    public void partition(String s,int start,List<String> current,List<List<String>> result) {
        if(start == s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));
                partition(s, end + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
