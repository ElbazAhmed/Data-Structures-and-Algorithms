package Strings_StringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindandReplacePattern {
    //https://leetcode.com/problems/find-and-replace-pattern
    //Given a list of strings words and a string pattern, return a list of words[i] that match pattern.
    //You may return the answer in any order.
    //A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x),
    //we get the desired word.
    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words,pattern));
    }
    static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<String>();
        for(String s : words){
            //if the string s match the pattern we add it to the list
            if(matchPattern(pattern,s)){
                result.add(s);
            }
        }
        return result;
    }
    static boolean matchPattern(String pattern, String s) {
        if(s.length() != pattern.length()){
            return false;
        }
        //create a hashmap key => Character of the pattern and value the characters with the same index in s
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                //different characters in s with some key of pattern ==> didn't match the pattern
                if(!map.get(pattern.charAt(i)).equals(s.charAt(i))){
                    return false;
                }
            }else{
                //if there is a key with the same value ==> didn't match the pattern
                if(map.containsValue(s.charAt(i))){
                    return false;
                }
                map.put(pattern.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
