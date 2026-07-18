class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=nums.length-1;i>=0;i--){
            c=Math.max(nums[i]+a,b);
            a=b;
            b=c;
        }
        return c;
    }
}