class Solution {
    public int thirdMax(int[] nums) {

        Long m1 = null;
        Long m2 = null;
        Long m3 = null;

        for (int num : nums) {

            if ((m1 != null && num == m1) ||
                (m2 != null && num == m2) ||
                (m3 != null && num == m3))
                continue;

            if (m1 == null || num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = (long) num;
            }
            else if (m2 == null || num > m2) {
                m3 = m2;
                m2 = (long) num;
            }
            else if (m3 == null || num > m3) {
                m3 = (long) num;
            }
        }

        return m3 == null ? m1.intValue() : m3.intValue();
    }
}