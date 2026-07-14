class NumArray {

    int[] ft;
    int[] nums;

    public NumArray(int[] nums) {

        this.nums = nums.clone();

        ft = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            add(i, nums[i]);
        }
    }

    // Internal Fenwick Tree update
    private void add(int index, int val) {

        int i = index + 1;

        while (i < ft.length) {
            ft[i] += val;
            i += (i & -i);
        }
    }

    // LeetCode update
    public void update(int index, int val) {

        int diff = val - nums[index];
        nums[index] = val;

        add(index, diff);
    }

    // Prefix sum
    private int prefixSum(int index) {

        int i = index + 1;
        int sum = 0;

        while (i > 0) {
            sum += ft[i];
            i -= (i & -i);
        }

        return sum;
    }

    public int sumRange(int left, int right) {

        if (left == 0)
            return prefixSum(right);

        return prefixSum(right) - prefixSum(left - 1);
    }
}