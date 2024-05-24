package Trees.heaps;

import java.util.PriorityQueue;

public class ReorganizeString {
    // https://leetcode.com/problems/reorganize-string/
    // Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
    //Return any possible rearrangement of s or return "" if not possible.
    
    public String reorganizeString(String s) {
        int[] index = new int[26];
        for (char c : s.toCharArray()) {
            index[c - 'a']++;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
                (a, b) -> index[b - 'a'] - index[a - 'a']
        );
        for (char c = 'a'; c <= 'z'; c++) {
            int count = index[c - 'a'];
            if (count == 0) continue;
            pq.add(c);
        }

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 1) {
            char current = pq.poll();
            char next = pq.poll();

            sb.append(current);
            sb.append(next);

            if (--index[current - 'a'] > 0) {
                pq.offer(current);
            }
            if (--index[next - 'a'] > 0) {
                pq.offer(next);
            }
        }

        if (!pq.isEmpty()) {
            char last = pq.poll();
            if (index[last - 'a'] > 1) {
                return "";
            }
            sb.append(last);
        }

        return sb.toString();
    }
}
