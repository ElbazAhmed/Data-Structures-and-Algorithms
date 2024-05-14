package Stacks_Queues;

import java.util.Stack;

// https://leetcode.com/problems/min-stack/
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//Implement the MinStack class:
//    MinStack() initializes the stack object.
//    void push(int val) pushes the element val onto the stack.
//    void pop() removes the element on the top of the stack.
//    int top() gets the top element of the stack.
//    int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.

public class MinStack {
    Stack<int[]> minStack;

    public MinStack() {
        this.minStack = new Stack<int[]>();
    }

    public void push(int val) {
        if(minStack.isEmpty()){
            minStack.push(new int[]{val,val});
        }else{
            minStack.push(new int[]{Math.min(minStack.peek()[0],val),val});
        }
    }
    public void pop() {
        minStack.pop();
    }

    public int top() {
        return minStack.peek()[1];
    }

    public int getMin() {
        return minStack.peek()[0];
    }
}
