class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int nums[], int startIn, int limit, int target) {

        if (startIn > limit) return -1;

        int index = ((limit - startIn)/2) + startIn;

        if (target == nums[index]) {
            return index;
        } else if (target > nums[index]) {
            return binarySearch(nums, index+1, limit, target);
        } else if (target < nums[index]) {
            return binarySearch(nums, startIn, index-1, target);
        }

        return -1;
    }
}