package Stacks_Queues;

public class DesignCircularQueue {
    // https://leetcode.com/problems/design-circular-queue
    // Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based
    // on FIFO (First In First Out) principle, and the last position is connected back to the first position to make a circle.
    // It is also called "Ring Buffer".
    class MyCircularQueue {
        protected int data[];
        private int front = 0;
        private int rear = 0;
        private int size = 0;

        public MyCircularQueue(int k) {
            this.data = new int[k];
        }

        public boolean enQueue(int value) {
            if(!isFull()){
                data[rear++] = value;
                rear = rear % data.length;
                size++;
                return true;
            }
            return false;
        }

        public boolean deQueue() {
            if(!isEmpty()){
                front++;
                front = front % data.length;
                size--;
                return true;
            }
            return false;
        }

        public int Front() {
            if(!isEmpty()){
                return data[front];
            }
            return -1;
        }

        public int Rear() {
            if(!isEmpty()){
                if(rear == 0){
                    return data[data.length-1];
                }else{
                    return data[rear-1];
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == data.length;
        }
    }
}
