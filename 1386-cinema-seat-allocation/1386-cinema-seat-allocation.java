class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            if (col >= 2 && col <= 9)
                hm.put(row, hm.getOrDefault(row, 0) | (1 << col));
        }

        int ans = (n - hm.size()) * 2;

        for (int mask : hm.values()) {

            boolean left = (mask & 0b0000111100) == 0;
            boolean middle = (mask & 0b0011110000) == 0;
            boolean right = (mask & 0b1111000000) == 0;

            if (left && right)
                ans += 2;
            else if (left || middle || right)
                ans++;
        }

        return ans;
    }
}