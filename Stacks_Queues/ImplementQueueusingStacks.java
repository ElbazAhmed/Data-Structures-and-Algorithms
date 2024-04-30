package Stacks_Queues;

import java.util.Stack;

public class ImplementQueueusingStacks {
    // https://leetcode.com/problems/implement-queue-using-stacks/
    // Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
    class MyQueue {
        Stack<Integer> first = new Stack<Integer>();
        Stack<Integer> second = new Stack<Integer>();

        public MyQueue() {

        }

        public void push(int x) {
            first.push(x);
        }

        public int pop() {
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed = second.pop();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }

        public int peek() {
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peek = second.peek();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peek;
        }

        public boolean empty() {
            return first.isEmpty();
        }
    }
}
