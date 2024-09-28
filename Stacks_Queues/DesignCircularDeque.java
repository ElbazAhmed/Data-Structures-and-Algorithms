package Stacks_Queues;

public class DesignCircularDeque {

    class MyCircularDeque {
        private final int maxSize;
        private int[] data;
        private int front;
        private int end;
        private int size;

        public MyCircularDeque(int k) {
            this.maxSize = k;
            this.data = new int[k];
            this.front = 0;
            this.end = k - 1;
            this.size = 0;
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }
            front = (front - 1 + maxSize) % maxSize;
            data[front] = value;
            size++;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            end = (end + 1) % maxSize;
            data[end] = value;
            size++;
            return true;
        }

        public boolean deleteFront() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % maxSize;
            size--;
            return true;
        }

        public boolean deleteLast() {
            if (isEmpty()) {
                return false;
            }
            end = (end - 1 + maxSize) % maxSize;
            size--;
            return true;
        }

        public int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return data[front];
        }

        public int getRear() {
            if (isEmpty()) {
                return -1;
            }
            return data[end];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == maxSize;
        }
    }
}
