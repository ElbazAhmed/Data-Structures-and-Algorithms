package Trees.heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    // https://leetcode.com/problems/top-k-frequent-words/
    // Given an array of strings words and an integer k, return the k most frequent strings.
    //Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<String>(
                (a,b) -> {
                    int freqCompare = Integer.compare(map.get(b), map.get(a));
                    if(freqCompare != 0){
                        return freqCompare;
                    }
                    return a.compareTo(b);
                }
        );
        for(String s : map.keySet()){
            pq.offer(s);
        }
        List<String> list = new ArrayList<String>();
        for(int i=0; i<k; i++){
            list.add(pq.remove());
        }
        return list;
    }
}
