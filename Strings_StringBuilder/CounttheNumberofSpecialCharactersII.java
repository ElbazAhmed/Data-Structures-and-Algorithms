package Strings_StringBuilder;

public class CounttheNumberofSpecialCharactersII {
    // https://leetcode.com/problems/count-the-number-of-special-characters-ii/
    // You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word,
    // and every lowercase occurrence of c appears before the first uppercase occurrence of c.
    //Return the number of special letters in word.
    public int numberOfSpecialChars(String word) {
        int[][] frequency = new int[64][2];
        int count = 0;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'A';
            if(index>31){
                frequency[index][0]++;
                frequency[index][1] = i;
            }
            if(index<32){
                if(frequency[index][0] == 0) frequency[index][1] = i;
                frequency[index][0]++;
                frequency[index][1] = Math.min(i,frequency[index][1]);
            }
        }
        for(int i=0; i<32; i++){
            if(frequency[i][0] > 0 && frequency[i+32][0] > 0){
                if(frequency[i][1] > frequency[i+32][1]) count++;
            }
        }
        return count;
    }
}
