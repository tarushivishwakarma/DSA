class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int g = 0;
        int c = 0;

        for (int i = 0; i < gas.length; i++) {
            g += gas[i];
            c += cost[i];
        }

        if (g < c)
            return -1;

        int total = 0;
        int idx = 0;

        for (int i = 0; i < gas.length; i++) {

            total += gas[i] - cost[i];

            if (total < 0) {
                total = 0;
                idx = i + 1;
            }
        }

        return idx;
    }
}