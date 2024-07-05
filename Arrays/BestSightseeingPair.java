package Arrays;

public class BestSightseeingPair {
    // https://leetcode.com/problems/best-sightseeing-pair/
    // You are given an integer array values where values[i] represents the value of the ith sightseeing spot. Two sightseeing spots i and j have a distance j - i between them.
    //The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.
    //Return the maximum score of a pair of sightseeing spots.

    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = Integer.MIN_VALUE;
        int length = values.length;
        int maxMinusIndex = values[0];
        for(int j=1; j<length; j++){
            maxScore = Math.max(maxScore, values[j]-j+maxMinusIndex);
            maxMinusIndex = Math.max(maxMinusIndex,values[j] + j);
        }
        return maxScore;
    }
}
