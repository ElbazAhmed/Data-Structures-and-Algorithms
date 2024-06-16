package Hash_Table;

import java.util.HashMap;

public class NumberofPairsofInterchangeableRectangles {
    // https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles/
    // You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
    //Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
    //Return the number of pairs of interchangeable rectangles in rectangles.

    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Integer> map = new HashMap<>();
        long count = 0;
        for (int[] rectangle : rectangles) {
            double ratio = rectangle[0] / (double) rectangle[1];
            int freq = map.getOrDefault(ratio, 0);
            count += freq;
            map.put(ratio, freq + 1);
        }
        return count;
    }
}
