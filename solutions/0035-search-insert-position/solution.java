class Solution {
    public int searchInsert(int[] nums, int target) {
      

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            }

            if (nums[mid] < target) {
                left = mid + 1; // look on the right side
            } else {
                right = mid - 1; // look on the left side
            }
        }

        // If not found, 'left' will be the correct insertion position
        return left;
    }
}
    
