package Trees.heaps;

import java.util.PriorityQueue;

public class DistantBarcodes {
    // https://leetcode.com/problems/distant-barcodes
    //In a warehouse, there is a row of barcodes, where the ith barcode is barcodes[i].
    //Rearrange the barcodes so that no two adjacent barcodes are equal. You may return any answer, and it is guaranteed an answer exists.
    public int[] rearrangeBarcodes(int[] barcodes) {
        int length = barcodes.length;
        int[] frequency = new int[10001];
        for (int barcode : barcodes) {
            frequency[barcode]++;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1]-a[1]);
        for(int i=0; i<frequency.length; i++){
            if(frequency[i] > 0){
                pq.offer(new int[]{i,frequency[i]});
            }
        }
        int index = 0;
        while(!pq.isEmpty()){
            int[] current = pq.poll();

            while (current[1] > 0) {
                if (index >= length) {
                    index = 1;
                }
                barcodes[index] = current[0];
                current[1]--;
                index += 2;
            }
        }
        return barcodes;
    }
}
