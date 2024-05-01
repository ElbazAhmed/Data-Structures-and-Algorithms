package Strings_StringBuilder;

public class ReversePrefixofWord {
    // https://leetcode.com/problems/reverse-prefix-of-word/
    //Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
    //If the character ch does not exist in word, do nothing.
    public String reversePrefix(String word, char ch) {
        char[] charr = word.toCharArray();
        int index = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<word.length(); i++){
            if(charr[i] == ch){
                index = i;
                break;
            }
        }
        if(index == 0){
            return word;
        }else{
            for(int i=index; i >= 0; i--){
                str.append(charr[i]);
            }
            for(int j=index+1; j<word.length(); j++){
                str.append(charr[j]);
            }
        }
        return str.toString();
    }
}
