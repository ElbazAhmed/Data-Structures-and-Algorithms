package Strings_StringBuilder;
import java.util.Arrays;
public class RearrangeWordsinaSentence {
    // https://leetcode.com/problems/rearrange-words-in-a-sentence/
    // Given a sentence text (A sentence is a string of space-separated words) in the following format:
    //    First letter is in upper case.
    //    Each word in text are separated by a single space.
    //Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.
    //Return the new text following the format shown above.

    public String arrangeWords(String text) {
        String[] words = text.split(" ");
        int length = words.length;
        words[0] = Character.toLowerCase(words[0].charAt(0)) + words[0].substring(1);
        Arrays.sort(words, (s,t) -> s.length()-t.length());
        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length; i++){
            sb.append(words[i]);
            if(i < length -1){
                sb.append(" ");
            }
        }
        String newText = sb.toString();
        return newText;
    }
}
