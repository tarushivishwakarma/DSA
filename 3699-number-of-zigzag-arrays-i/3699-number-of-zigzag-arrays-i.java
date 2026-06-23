class Solution {
    public int zigZagArrays(int n, int l, int r) {
        int MOD = 1000000007;

        r -= l;

        int[] dp = new int[r + 1];

        for (int i = 0; i <= r; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            int pre = 0;

            if ((i & 1) == 1) {

                for (int v = 0; v <= r; v++) {
                    int temp = (pre + dp[v]) % MOD;
                    dp[v] = pre;
                    pre = temp;
                }

            } else {

                for (int v = r; v >= 0; v--) {
                    int temp = (pre + dp[v]) % MOD;
                    dp[v] = pre;
                    pre = temp;
                }
            }
        }

        int ans = 0;

        for (int x : dp) {
            ans = (ans + x) % MOD;
        }

        return (ans * 2) % MOD;
    }
}