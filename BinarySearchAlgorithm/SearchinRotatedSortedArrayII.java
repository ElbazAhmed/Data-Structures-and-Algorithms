package BinarySearchAlgorithm;

public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,3,1,1,1,1};
        int target =3;
        System.out.println(search(nums,target));
    }

    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target)
                return true;
            if (nums[start] == nums[middle] && nums[middle] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] <= nums[middle]) {
                if (nums[start] <= target && target < nums[middle])
                    end = middle - 1;
                else
                    start = middle + 1;
            } else {
                if (nums[middle] < target && target <= nums[end])
                    start = middle + 1;
                else
                    end = middle - 1;
            }
        }

        return false;

    }


}
