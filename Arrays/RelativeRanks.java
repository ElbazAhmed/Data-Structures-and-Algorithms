package Arrays;

import java.util.HashMap;
import java.util.Arrays;

public class RelativeRanks {
    // https://leetcode.com/problems/relative-ranks/
    // You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
    //The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on.
    // The placement of each athlete determines their rank:
    //    The 1st place athlete's rank is "Gold Medal".
    //    The 2nd place athlete's rank is "Silver Medal".
    //    The 3rd place athlete's rank is "Bronze Medal".
    //    For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
    //Return an array answer of size n where answer[i] is the rank of the ith athlete.
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        int length = score.length;
        int[] scoreSorted = Arrays.copyOfRange(score,0,length);
        Arrays.sort(scoreSorted);
        for(int i=0; i<length; i++){
            String place = length-i + "";
            if(length-i == 1){
                place = "Gold Medal";
            }else if(length-i == 2){
                place = "Silver Medal";
            }else if(length-i == 3){
                place = "Bronze Medal";
            }
            map.put(scoreSorted[i],place);
        }
        String[] placement = new String[length];
        for(int j=0; j<length; j++){
            placement[j] = map.get(score[j]);
        }
        return placement;
    }
}
