package Trees.heaps;

import java.util.PriorityQueue;

public class SortthePeople {
    // https://leetcode.com/problems/sort-the-people/
    // You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
    //For each index i, names[i] and heights[i] denote the name and height of the ith person.
    //Return names sorted in descending order by the people's heights.

    public String[] sortPeople(String[] names, int[] heights) {
        int length = names.length;
        int index = 0;
        String[] result = new String[length];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> b[0]-a[0]);
        for(int i=0; i<length; i++) pq.offer(new int[]{heights[i], i});
        while(!pq.isEmpty()){
            result[index] = names[pq.poll()[1]];
            index++;
        }
        return result;
    }
}
