class Solution {
    public boolean sumGame(String num) {

        int sum1 = 0, sum2 = 0;
        int q1 = 0, q2 = 0;

        int n = num.length();

        for (int i = 0; i < n / 2; i++) {
            char ch = num.charAt(i);

            if (ch == '?')
                q1++;
            else
                sum1 += ch - '0';
        }

        for (int i = n / 2; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?')
                q2++;
            else
                sum2 += ch - '0';
        }

        int diff = sum1 - sum2;
        int qDiff = q1 - q2;

        // Odd number of '?' difference
        if (qDiff % 2 != 0)
            return true;

        return diff != 9 * (q2 - q1) / 2;
    }
}