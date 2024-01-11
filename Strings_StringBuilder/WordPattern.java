package Strings_StringBuilder;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
    //https://leetcode.com/problems/word-pattern/
    //Given a pattern and a string s, find if s follows the same pattern.
    //Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern,s));
    }
    static boolean wordPattern(String pattern, String s) {
        //split the string s by space
        String[] strArray = s.split(" ");
        if(strArray.length != pattern.length()){
            return false;
        }
        //create a hashmap with character of the pattern as key and value strings of strArray
        HashMap<Character,String> map = new HashMap<Character,String>();
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                //if the map contains the key with different string than s doesn't follow the pattern
                if(!map.get(pattern.charAt(i)).equals(strArray[i])){
                    return false;
                }
            }else{
                //if there is a different key with the same value then s doesn't follow the pattern
                if(map.containsValue(strArray[i])){
                    return false;
                }
                map.put(pattern.charAt(i),strArray[i]);
            }
        }
        return true;
    }
}
