package Graphs;
import java.util.Arrays;
public class MaximumTotalImportanceofRoads {
    // https://leetcode.com/problems/maximum-total-importance-of-roads/
    // You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.
    //You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.
    //You need to assign each city with an integer value from 1 to n, where each value can only be used once.
    // The importance of a road is then defined as the sum of the values of the two cities it connects.
    //Return the maximum total importance of all roads possible after assigning the values optimally.

    public long maximumImportance(int n, int[][] roads) {
        long[] edgeImportances = new long[n];
        for (int[] road : roads) {
            edgeImportances[road[0]]++;
            edgeImportances[road[1]]++;
        }
        Arrays.sort(edgeImportances);
        long currentImportance =1;
        long maxImportance = 0;
        for (long edge : edgeImportances) {
            maxImportance += edge*currentImportance;
            currentImportance++;
        }

        return maxImportance;
    }
}
