package Bit_Manipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,1,-1,3};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
