package Trees.heaps;
import java.util.PriorityQueue;
public class HandofStraights {
    // https://leetcode.com/problems/hand-of-straights/
    // Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
    //Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n : hand){
            pq.add(n);
        }
        while(!pq.isEmpty()){
            int first = pq.poll();
            for(int i=1; i<groupSize; i++){
                if(!pq.remove(first+i)) return false;
            }
        }
        return true;
    }
}
