package Strings_StringBuilder;

public class FindtheIndexoftheFirstOccurrenceinaString {
    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
    // Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for(int i=0; i<h; i++){
            if(i+n<=h && needle.equals(haystack.substring(i,i+n))){
                return i;
            }
        }
        return -1;
    }
}
