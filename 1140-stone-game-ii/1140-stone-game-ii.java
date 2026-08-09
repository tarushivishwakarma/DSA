class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        int[] suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--)
            suffix[i] = suffix[i + 1] + piles[i];

        int[][] dp = new int[n][n + 1];

        return solve(piles, 0, 1, suffix, dp);
    }

    int solve(int[] piles, int i, int m, int[] suffix, int[][] dp) {

        if (i >= piles.length)
            return 0;

        if (dp[i][m] != 0)
            return dp[i][m];

        int ans = 0;

        for (int x = 1; x <= 2 * m && i + x <= piles.length; x++) {

            int opponent = solve(
                piles,
                i + x,
                Math.max(m, x),
                suffix,
                dp
            );

            ans = Math.max(ans, suffix[i] - opponent);
        }

        return dp[i][m] = ans;
    }
}