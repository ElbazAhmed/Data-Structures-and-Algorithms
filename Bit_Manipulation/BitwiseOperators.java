package Bit_Manipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        int num = 2;
        //System.out.println(isOdd(num));
        //20 => 10100
        //System.out.println(findithBit(20,2));  //result 0
        System.out.println(setithBit(20,4)); //result 28 => 11100

    }

    //AND Operator
    static boolean isOdd(int num){
        //an int is odd if the LSB (the least significant bit) is equal to 1
        //if the LSB of num is equal to 1 the result of this (num & 1) is 1
        return (num & 1) == 1;
    }


    //Shift left operator
    static int findithBit(int num, int ithBit){
        //given a binary presentation of an integer find the ith bit of it
        //the shift left operrator 1<<(ithBit-1) give us the binary presentation of Math.pow(2,ithBit-1)
        //because a << b = a*Math.pow(2,b)
        if((num & (1<<(ithBit-1))) == 0){
            //if the result is 0 its means that the ith bit is 0
            return 0;
        }
        return 1;
    }

    //OR Operator + Shift left operator
    static int setithBit(int num, int ithBit){
        //given a binary presentation of an integer set the ith bit to 1
        //the shift left operrator 1<<(ithBit-1) give us the binary presentation of Math.pow(2,ithBit-1)
        //because a << b = a*Math.pow(2,b)
        int result = (1<<(ithBit-1))|num;
        return result;
    }

}
