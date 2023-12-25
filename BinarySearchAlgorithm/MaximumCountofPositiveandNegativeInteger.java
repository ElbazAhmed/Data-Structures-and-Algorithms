package BinarySearchAlgorithm;

public class MaximumCountofPositiveandNegativeInteger {
    //https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
    //Given an array nums sorted in non-decreasing order,
    // return the maximum between the number of positive integers and the number of negative integers.
    //O(log(n)) time complexity
    public static void main(String[] args) {
        int[] nums = {-2,-1,4};
        System.out.println(maximumCount(nums));
    }
    static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        int posIndex = index(nums,true);
        int negIndex = index(nums,false);
        if(posIndex != -1){
            pos = nums.length-posIndex;
        }
        if(negIndex != -1){
            neg = negIndex+1;
        }
        return Math.max(pos,neg);

    }


    static int index(int[] nums,boolean isPos){
        int start=0;
        int end =nums.length-1;
        while(start <= end){
            int middle=(start + end)/2;
            if(isPos){
                if(nums[middle]<=0){
                    start=middle+1;
                }else if(middle>0 && nums[middle]>0 && nums[middle-1]>0){
                    end=middle-1;
                }else{
                    return middle;
                }
            }else{
                if(nums[middle]>=0){
                    end=middle-1;
                }else if(middle<nums.length-1 && nums[middle]<0 && nums[middle+1]<0){
                    start=middle+1;
                }else{
                    return middle;
                }
            }
        }
        return -1;
    }

}
