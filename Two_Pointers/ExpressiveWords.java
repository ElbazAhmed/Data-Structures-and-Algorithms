package Two_Pointers;

public class ExpressiveWords {
    //https://leetcode.com/problems/expressive-words/
    // You are given a string s and an array of query strings words.
    // A query word is stretchy if it can be made to be equal to s by any number of applications of the following extension operation: choose a group consisting of characters c, and add some number of characters c to the group so that the size of the group is three or more.
    //    For example, starting with "hello", we could do an extension on the group "o" to get "hellooo", but we cannot get "helloo" since the group "oo" has a size less than three. Also, we could do another extension like "ll" -> "lllll" to get "helllllooo". If s = "helllllooo", then the query word "hello" would be stretchy because of these two extension operations: query = "hello" -> "hellooo" -> "helllllooo" = s.
    //Return the number of query strings that are stretchy.

    public int expressiveWords(String s, String[] words) {
        int count = 0;
        for(String word : words) {
            if(expressive(s,word)) count++;
        }
        return count;
    }

    public boolean expressive(String s, String word){
        int sIndex = 0;
        int wordIndex = 0;
        while (sIndex < s.length() && wordIndex < word.length()) {
            if (s.charAt(sIndex) != word.charAt(wordIndex)) return false;
            int sCount = 1;
            while (sIndex + 1 < s.length() && s.charAt(sIndex) == s.charAt(sIndex + 1)) {
                sIndex++;
                sCount++;
            }
            int wordCount = 1;
            while (wordIndex + 1 < word.length() && word.charAt(wordIndex) == word.charAt(wordIndex + 1)) {
                wordIndex++;
                wordCount++;
            }
            if ((wordCount > sCount)  || ( sCount < 3 && sCount != wordCount) ) return false;
            sIndex++;
            wordIndex++;
        }
        if(sIndex == s.length() && wordIndex == word.length()) return true;
        return false;
    }
}
