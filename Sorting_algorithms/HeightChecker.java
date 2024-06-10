package Sorting_algorithms;

public class HeightChecker {
    // https://leetcode.com/problems/height-checker/
    // A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height.
    // Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    //You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
    //Return the number of indices where heights[i] != expected[i].
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] frequency = new int[101];
        for(int height : heights){
            frequency[height]++;
        }
        int j = 0;
        for(int i=0; i<101; i++){
            while(frequency[i] > 0){
                if(heights[j] != i) count++;
                frequency[i]--;
                j++;
            }
        }
        return count;
    }
}
