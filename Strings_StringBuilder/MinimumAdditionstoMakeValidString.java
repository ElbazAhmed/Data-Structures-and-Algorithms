package Strings_StringBuilder;

public class MinimumAdditionstoMakeValidString {
    // https://leetcode.com/problems/minimum-additions-to-make-valid-string/
    // Given a string word to which you can insert letters "a", "b" or "c" anywhere and any number of times,
    // return the minimum number of letters that must be inserted so that word becomes valid.
    //A string is called valid if it can be formed by concatenating the string "abc" several times.

    public int addMinimum(String word) {
        char prev = 'z';
        int count = 0;
        int length = word.length();
        for(int i=0; i<length; i++){
            char c = word.charAt(i);
            if(c <= prev) count++;
            prev = c;
        }
        return count*3-length;
    }
}
