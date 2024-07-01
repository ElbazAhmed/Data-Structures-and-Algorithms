package Arrays;

public class ThreeConsecutiveOdds {
    // https://leetcode.com/problems/three-consecutive-odds/
    // Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false. 

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
