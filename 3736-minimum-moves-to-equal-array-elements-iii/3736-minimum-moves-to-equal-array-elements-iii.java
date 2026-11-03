class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int ans = 0;

        for (int x : nums) {
            max = Math.max(max, x);
        }

        for (int x : nums) {
            ans += max - x;
        }

        return ans;
    }
}