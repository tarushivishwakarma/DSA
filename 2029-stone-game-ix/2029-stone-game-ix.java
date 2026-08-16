class Solution {
    public boolean stoneGameIX(int[] stones) {

        int[] count = new int[3];

        for (int stone : stones)
            count[stone % 3]++;

        // If there are no remainder-1 or remainder-2 stones,
        // Alice cannot make the sum non-divisible by 3.
        if (count[1] == 0 && count[2] == 0)
            return false;

        // If count[0] is even, Alice wins if either
        // remainder group has enough stones.
        if (count[0] % 2 == 0)
            return count[1] >= 1 && count[2] >= 1;

        // count[0] is odd
        return Math.abs(count[1] - count[2]) > 2;
    }
}