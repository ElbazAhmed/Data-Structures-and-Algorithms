package Stacks_Queues;

public class CustomStack {

    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return pointer == data.length -1;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full!");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty!");
        }
        int removedItem = data[pointer];
        pointer--;
        return removedItem;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty!");
        }
        return data[pointer];
    }
}
