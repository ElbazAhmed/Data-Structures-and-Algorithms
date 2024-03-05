package Strings_StringBuilder;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsinaString {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    //Given an input string s, reverse the order of the words.
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        // Split the string 's' into an array of substrings using space as the delimiter
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        // Reverse the array of substrings
        Collections.reverse(Arrays.asList(arr));
        // build the reversed string
        str.append(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(!arr[i].isEmpty()){
                str.append(" ").append(arr[i]);
            }
        }
        return str.toString();
    }
}
