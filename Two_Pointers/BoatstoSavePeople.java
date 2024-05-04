package Two_Pointers;

import java.util.Arrays;
public class BoatstoSavePeople {
    // https://leetcode.com/problems/boats-to-save-people/
    // You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit.
    // Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
    //Return the minimum number of boats to carry every given person.
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }
}
