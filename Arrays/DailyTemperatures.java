package Arrays;

public class DailyTemperatures {
    // https://leetcode.com/problems/daily-temperatures/
    // Given an array of integers temperatures represents the daily temperatures,
    // return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
    // If there is no future day for which this is possible, keep answer[i] == 0 instead.

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] tempIndex = new int[101];
        int[] result = new int[length];
        for(int i=length-1; i>=0; i--){
            int temp = temperatures[i];
            tempIndex[temp] = i;
            int warmerIndex = i;
            for(int j=temp; j<101; j++){
                if(tempIndex[j] > i ){
                    if(warmerIndex > i){
                        warmerIndex = Math.min(tempIndex[j],warmerIndex);
                    }else{
                        warmerIndex = tempIndex[j];
                    }
                }
            }
            result[i] = warmerIndex - i;

        }
        return result;
    }
}
