package Stacks_Queues;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            // double the size of the array
            int[] temp = new int[data.length *2];
            // copy the previous element of the array data to temp
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // now we are sure that the array is not full
        return super.push(item);
    }
}
