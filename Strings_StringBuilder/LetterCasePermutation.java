package Strings_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    // https://leetcode.com/problems/letter-case-permutation/
    // Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
    //Return a list of all possible strings we could create. Return the output in any order.

    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<String>();
        char[] charsPerm = new char[s.length()];
        char[] ch = s.toCharArray();
        backtrack(ch,0,list,charsPerm);
        return list;
    }
    public void backtrack(char[] ch, int i, List<String> list, char[] charPerm){
        if(i == ch.length){
            list.add(new String(charPerm));
            return;
        }
        if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')){
            charPerm[i]= Character.toLowerCase(ch[i]);
            backtrack(ch,i+1,list,charPerm);
            charPerm[i]= Character.toUpperCase(ch[i]);
            backtrack(ch,i+1,list,charPerm);
        }else{
            charPerm[i]= ch[i];
            backtrack(ch,i+1,list,charPerm);
        }
    }
}
