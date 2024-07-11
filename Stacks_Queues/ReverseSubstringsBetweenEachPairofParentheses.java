package Stacks_Queues;

import java.util.Stack;

public class ReverseSubstringsBetweenEachPairofParentheses {
    // https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
    // You are given a string s that consists of lower case English letters and brackets.
    //Reverse the strings in each pair of matching parentheses, starting from the innermost one.
    //Your result should not contain any brackets.

    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder());

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(new StringBuilder());
            } else if (c == ')') {
                StringBuilder sb = stack.pop().reverse();
                stack.peek().append(sb);
            } else {
                stack.peek().append(c);
            }
        }

        return stack.peek().toString();
    }
}
