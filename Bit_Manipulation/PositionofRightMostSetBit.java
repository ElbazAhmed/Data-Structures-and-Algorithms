package Bit_Manipulation;

public class PositionofRightMostSetBit {
    //Finds the position of the rightmost set bit in the given number.
    public static void main(String[] args) {
        int num = 20; //10100
        System.out.println(position(num));
    }

    static int position(int num){
        // Initialize the position counter
        int position = 0;
        // Initialize a mask with only the least significant bit set to 1
        int mask = 1;
        // Iterate through the bits of the number until a set bit is found
        while((num & mask) == 0){
            // Increment the position counter and update the mask to check the next bit
            mask+=Math.pow(2,position+1);
            position++;
        }
        return position+1;
    }
}
