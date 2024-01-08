package BinarySearchAlgorithm;

public class FindMinimuminRotatedSortedArrayII {
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
    //Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
    public static void main(String[] args) {
        int[] nums = {3,3,3,1};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            //skipd duplicate elements in the array
            while(start<end && (nums[start]==nums[end] || nums[start]==nums[start+1])){
                if(nums[start]==nums[end]){
                    end--;
                }
                if(nums[start]==nums[start+1]){
                    start++;
                }
            }
            int middle = start+(end-start)/2;
            //if we find the pivot element the next element is the min
            if(middle<end && nums[middle]>nums[middle+1]){
                return nums[middle+1];
            }else if(middle>start && nums[middle]<nums[middle-1]){
                return nums[middle];
            }
            if(nums[middle]<=nums[start]){
                end=middle-1;
            }else if(nums[middle]>nums[start]){
                start=middle+1;
            }
        }
        //if the array doesn't contain a pivot element it means it's a normal sorted array
        //the min is then the first element in the array
        return nums[0];
    }
}
