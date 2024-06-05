package Strings_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    // https://leetcode.com/problems/find-common-characters/
    // Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates).
    // You may return the answer in any order.

    public List<String> commonChars(String[] words) {
        List<String> commonChars = new ArrayList<>();

        int[] minFrequency = new int[26];
        for (char c : words[0].toCharArray()) {
            minFrequency[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] frequency = new int[26];
            for (char c : words[i].toCharArray()) {
                frequency[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFrequency[j] = Math.min(minFrequency[j], frequency[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFrequency[i]; j++) {
                commonChars.add(String.valueOf((char) (i + 'a')));
            }
        }

        return commonChars;
    }
}
