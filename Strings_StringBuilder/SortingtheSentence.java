package Strings_StringBuilder;

public class SortingtheSentence {
    // https://leetcode.com/problems/sorting-the-sentence/
    // A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
    // Each word consists of lowercase and uppercase English letters.
    //A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
    //    For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
    //Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int length = arr.length;
        String[] sortedString = new String[length];
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            int index = str.charAt(str.length()-1) - '0';
            sortedString[index-1] = str.substring(0,str.length()-1);
        }
        for(int i=0; i<length; i++){
            sb.append(sortedString[i]);
            if(i < length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
