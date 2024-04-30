package Stacks_Queues;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is Full!");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removed = data[0];
        //shift the elements to left
        for (int i = 0; i < end; i++) {
            data[i] = data[i+1];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return data[0];
    }
}
