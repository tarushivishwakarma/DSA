class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        // dp[i] = how many characters of word2
        // can be matched from word1[i...]
        int[] dp = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];

            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                dp[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int i = 0;
        j = 0;
        boolean changed = false;

        while (i < n && j < m) {

            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                i++;
                j++;
            }
            else if (!changed &&
                     (j == m - 1 || dp[i + 1] >= m - j - 1)) {

                // Use our one allowed character change
                ans[j] = i;
                changed = true;
                i++;
                j++;
            }
            else {
                i++;
            }
        }

        if (j != m)
            return new int[0];

        return ans;
    }
}