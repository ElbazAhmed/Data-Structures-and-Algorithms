package Stacks_Queues;

public class DesignaStackWithIncrementOperation {
    // https://leetcode.com/problems/design-a-stack-with-increment-operation/
    // Design a stack that supports increment operations on its elements.
    //Implement the CustomStack class:
    //    CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack.
    //    void push(int x) Adds x to the top of the stack if the stack has not reached the maxSize.
    //    int pop() Pops and returns the top of the stack or -1 if the stack is empty.
    //    void inc(int k, int val) Increments the bottom k elements of the stack by val. If there are less than k elements in the stack, increment all the elements in the stack.

    class CustomStack {

        private int[] data;
        private int size;

        public CustomStack(int maxSize) {
            this.data = new int[maxSize];
            this.size = -1;
        }

        public void push(int x) {
            if(size+1 < data.length){
                size++;
                data[size] = x;
            }
        }

        public int pop() {
            if(size >= 0){
                int removed = data[size];
                size--;
                return removed;
            }
            return -1;
        }

        public void increment(int k, int val) {
            int min = Math.min(k,data.length);
            for(int i=0; i<min; i++){
                data[i] += val;
            }
        }
    }
}
