package Strings_StringBuilder;

public class SeparateBlackandWhiteBalls {
    // https://leetcode.com/problems/separate-black-and-white-balls/
    public long minimumSteps(String s) {
        int index = 0;
        long minSteps = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                minSteps += i-index;
                index++;
            }
        }

        return minSteps;
    }
}
