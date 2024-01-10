package Math;

public class PalindromeNumber {
    //https://leetcode.com/problems/palindrome-number/
    //Given an integer x, return true if x is a palindrome, and false otherwise.
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //copy of the integer x to compare with it in the end
        int copyx=x;
        int newx = 0;
        while(x>0){
            //at every iteration we add the last digit in x to newx
            newx=newx*10 +x%10;
            x/=10;
        }
        //newx is the reverse of x
        if(newx==copyx){
            return true;
        }else{
            return false;
        }

    }
}
