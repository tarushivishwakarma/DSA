class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long total = 0;
        for (int b : batteries) {
            total += b;
        }

        long left = 0;
        long right = total / n; // max possible minutes per computer

        while (left < right) {
            long mid = (left + right + 1) / 2;

            long usable = 0;
            for (int b : batteries) {
                usable += Math.min(b, mid);
            }

            if (usable >= mid * n) {
                // mid is feasible
                left = mid;
            } else {
                // mid is too big
                right = mid - 1;
            }
        }

        return left;
    }
}

