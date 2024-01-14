package Arrays;

public class RemoveElement {
    //https://leetcode.com/problems/remove-element
    //Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    // The remaining elements of nums are not important as well as the size of nums.
    //Return k.
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
    static int removeElement(int[] nums, int val) {
        int index = 0 ;
        for(int i = 0; i<nums.length; i++){
            //if the element is not equal to value put it in the beginning of the array
            if(nums[i]!=val){
                nums[index]=nums[i];
                //increment then the index
                index++;
            }
        }
        //the first index elemet is not equal to the val
        return index;
    }
}
