package Strings_StringBuilder;

public class LongestPalindrome {
    // https://leetcode.com/problems/longest-palindrome/
    // Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
    //Letters are case sensitive, for example, "Aa" is not considered a palindrome.

    
    public int longestPalindrome(String s) {
        int[] frequency= new int[100];
        int odd = 0;
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'A']++;
        }
        int maxLength=0;
        for(int i=0;i<100;i++){
            int freq = frequency[i];
            if(freq%2==1){
                maxLength+=(freq-1);
                odd = 1;
            }else{
                maxLength+=freq;
            }
        }
        return maxLength+odd;
    }
}
