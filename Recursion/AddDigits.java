package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {
    //https://leetcode.com/problems/add-digits/
    //Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
    public static void main(String[] args) {
        System.out.println(addDigits(48));
    }
    static int addDigits(int num) {
        //convert num to a string
        String numStr = "" + num;
        //this is the base condition if the integer num contain 1 digit
        if(numStr.length()==1){
            return num;
        }
        int n=0;
        for(int i=0; i<numStr.length(); i++){
            //subtract the ascii value of this charter from the ascii character of 0 give us the integer value of this character
            n += (numStr.charAt(i) - '0');
        }
        //then recall addDigits for the new integer
        return addDigits(n);
    }
}
