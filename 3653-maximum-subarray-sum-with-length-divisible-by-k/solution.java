class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        // prefixSum[i] = sum of nums[0..i-1]
        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        // minPrefix[r] = minimum prefixSum at any index j where (j % k == r)
        long[] minPrefix = new long[k];

        long INF = Long.MAX_VALUE / 2;  // large number to act like +infinity

        // Initialize all with +infinity
        for (int r = 0; r < k; r++) {
            minPrefix[r] = INF;
        }

        // Index 0 has prefixSum = 0 and remainder 0
        // This allows subarrays starting from index 0
        minPrefix[0] = 0;

        long answer = Long.MIN_VALUE;

        // j is the end index of prefix (subarray ends at j-1)
        for (int j = 1; j <= n; j++) {
            int remainder = j % k;

            // If we have seen any prefix with this remainder
            if (minPrefix[remainder] != INF) {
                long candidate = prefixSum[j] - minPrefix[remainder];
                if (candidate > answer) {
                    answer = candidate;
                }
            }

            // Update the minimum prefix sum for this remainder
            if (prefixSum[j] < minPrefix[remainder]) {
                minPrefix[remainder] = prefixSum[j];
            }
        }

        return answer;
    }
}

