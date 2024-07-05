package Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    // https://leetcode.com/problems/camelcase-matching/
    // Given an array of strings queries and a string pattern, return a boolean array answer where answer[i] is true if queries[i] matches pattern, and false otherwise.
    //A query word queries[i] matches pattern if you can insert lowercase English letters pattern so that it equals the query.
    // You may insert each character at any position and you may not insert any characters.
    
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>(queries.length);

        for(String s : queries) result.add(matchPattern(s,pattern));

        return result;
    }

    private boolean matchPattern(String s, String pattern){
        int p=pattern.length();
        int i = 0;
        int j = 0;

        while(i < s.length()){
            if(j<p && s.charAt(i) == pattern.charAt(j)){
                j++;
            }else{
                if(Character.isUpperCase(s.charAt(i))) return false;
            }
            i++;
        }

        return j == p;
    }

}
