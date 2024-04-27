package Math;

public class HappyNumber {
    // https://leetcode.com/problems/happy-number/
    //Write an algorithm to determine if a number n is happy.
    //A happy number is a number defined by the following process:
    //    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    //    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    //    Those numbers for which this process ends in 1 are happy.
    //Return true if n is a happy number, and false if not.
    
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            fast = findSquare(findSquare(fast));
            slow = findSquare(slow);
        } while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;
    }

    public int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int digit = num % 10;
            ans += digit*digit;
            num /= 10;
        }
        return ans;
    }
}
