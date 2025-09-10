class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : nums) {
            if (number < min)
                min = number;
            if (number > max)
                max = number;
        }
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (min % i == 0 && max % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
