package Strings_StringBuilder;

public class AppendCharacterstoStringtoMakeSubsequence {
    // https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
    // You are given two strings s and t consisting of only lowercase English letters.
    //Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.
    //A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
    public int appendCharacters(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        int sLength = s.length();
        int tLength = t.length();
        while(sIndex < sLength && tIndex < tLength){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                tIndex++;
            }
            sIndex++;
        }
        return tLength-tIndex;
    }
}
