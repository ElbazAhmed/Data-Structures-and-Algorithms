package Stacks_Queues;

import java.util.Stack;

public class RemovingStarsFromaString {
    // https://leetcode.com/problems/removing-stars-from-a-string
    // You are given a string s, which contains stars *.
    //In one operation, you can:
    //    Choose a star in s.
    //    Remove the closest non-star character to its left, as well as remove the star itself.
    //Return the string after all stars have been removed.

    public String removeStars(String s) {
        Stack<Character> first = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                first.pop();
            }else{
                first.push(c);
            }
        }
        StringBuilder str = new StringBuilder();
        for(char c : first){
            str.append(c);
        }
        return str.toString();
    }
}
