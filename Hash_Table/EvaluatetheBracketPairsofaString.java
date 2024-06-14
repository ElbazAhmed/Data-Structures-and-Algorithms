package Hash_Table;

import java.util.HashMap;
import java.util.List;

public class EvaluatetheBracketPairsofaString {
    // https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
    // You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.
    //    For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".
    //You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each knowledge[i] = [keyi, valuei] indicates that key keyi has a value of valuei.
    //You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:
    //    Replace keyi and the bracket pair with the key's corresponding valuei.
    //    If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?" (without the quotation marks).
    //Each key will appear at most once in your knowledge. There will not be any nested brackets in s.
    //Return the resulting string after evaluating all of the bracket pairs.
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(j) != ')') {
                    j++;
                }
                String word = s.substring(i + 1, j);
                String val = map.get(word);
                if (val != null) {
                    result.append(val);
                } else {
                    result.append("?");
                }
                i = j;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
