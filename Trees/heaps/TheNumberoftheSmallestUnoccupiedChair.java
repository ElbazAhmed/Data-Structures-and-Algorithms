package Trees.heaps;
import java.util.Comparator;
import java.util.PriorityQueue;
public class TheNumberoftheSmallestUnoccupiedChair {
    // https://leetcode.com/problems/the-number-of-the-smallest-unoccupied-chair/

    public int smallestChair(int[][] times, int targetFriend) {
        int length = times.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> a[1] - b[1]);
        for(int i=0; i<times.length; i++){
            int[] arr = new int[]{i,times[i][0],times[i][1]};
            pq.add(arr);
        }
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < length; i++) {
            availableChairs.add(i);
        }
        // [leave time, chair number]
        PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        while(!pq.isEmpty()){
            int[] peek = pq.poll();

            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= peek[1]) {
                availableChairs.add(occupiedChairs.poll()[1]);
            }

            if(peek[0] == targetFriend){
                return availableChairs.peek();
            }else{
                occupiedChairs.add(new int[]{peek[2],availableChairs.poll()});
            }
        }
        return -1; // Should never be reached
    }
}
