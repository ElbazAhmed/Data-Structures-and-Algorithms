package Stacks_Queues;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
    // https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
    // You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
    //    For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
    //Return the minimum number of moves required to make s valid.

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && (c == ')' && stack.peek() == '(')){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.size();
    }
}
