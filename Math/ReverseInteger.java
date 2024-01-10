package Math;

public class ReverseInteger {
    //https://leetcode.com/problems/reverse-integer
    //Given a signed 32-bit integer x, return x with its digits reversed.
    // If reversing x causes the value to go outside the signed 32-bit integer range, then return 0.
    public static void main(String[] args) {
        int x= 123;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        int maxValue=2147483647;
        int reversex=0;
        int sign= 1;
        if(x<0){
            sign=-1;
        }
        x*=sign;
        while(x>0){
            //return 0 if reversex go outside the signed 32-bit integer range
            if(reversex>(maxValue-(x%10))/10){
                return 0;
            }
            //at every step add the last digit in x as the first digit in reversex
            reversex=reversex*10+x%10;
            x/=10;
        }
        //multiply reversex by the initial sign of x
        return reversex*sign;
    }
}
