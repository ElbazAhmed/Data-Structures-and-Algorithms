package Strings_StringBuilder;

import java.util.HashMap;

public class CustomSortString {
    //https://leetcode.com/problems/custom-sort-string/
    //Permute the characters of s so that they match the order that order was sorted.
    // More specifically, if a character x occurs before a character y in order,
    // then x should occur before y in the permuted string.
    public static void main(String[] args) {
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order,s));
    }

    static String customSortString(String order, String s) {
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        char[] charArray = order.toCharArray();
        StringBuilder str = new StringBuilder();
        //add Characters of the String s to the hashmap ket->Character value->character count in the string
        for(int i=0; i<s.length(); i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }else{
                hash.put(s.charAt(i),1);
            }
        }
        //if a character of order exist in the hashmap add it to string builder in the order
        for(int i=0; i<order.length(); i++){
            if(hash.containsKey(charArray[i])){
                for(int j=0; j<hash.get(charArray[i]);j++){
                    str.append(charArray[i]);
                }
                hash.remove(charArray[i]);
            }
        }
        //add other characters that not exist in the string order 
        for(char c : hash.keySet()){
            for(int i=0; i<hash.get(c); i++){
                str.append(c);
            }
        }

        return str.toString();

    }
}
