package Recursion;

public class NumberofStepstoReduceaNumbertoZero {
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    //Given an integer num, return the number of steps to reduce it to zero.
    //In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    public static void main(String[] args) {
        System.out.println(numberOfSteps(48));
    }
    static int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
        if(num%2==0){
            num/=2;
        }else{
            num-=1;
        }
        return 1+numberOfSteps(num);
    }
}
