package Bit_Manipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(isOdd(num));
    }

    static boolean isOdd(int num){
        //an int is odd if the LSB (the least significant bit) is equal to 1
        //if the LSB of num is equal to 1 the result of this (num & 1) is 1  
        return (num & 1) == 1;
    }

}
