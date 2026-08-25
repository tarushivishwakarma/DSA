class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> hs = new HashSet<>();

        for (int x : nums)
            hs.add(x);

        for (int i = k; ; i += k) {
            if (!hs.contains(i))
                return i;
        }
    }
}