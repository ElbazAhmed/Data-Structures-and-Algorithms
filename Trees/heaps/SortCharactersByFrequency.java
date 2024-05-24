package Trees.heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    // https://leetcode.com/problems/sort-characters-by-frequency/
    // Given a string s, sort it in decreasing order based on the frequency of the characters.
    // The frequency of a character is the number of times it appears in the string.
    //Return the sorted string. If there are multiple answers, return any of them.
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<Character>(
                (c1, c2) -> map.get(c2) - map.get(c1)
        );
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            int frequency = map.get(c);
            for(int i=0; i<frequency; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
