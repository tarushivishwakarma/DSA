class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+2];
        for(int i=nums.length-1;i>=0;i--){
            int p=nums[i]+dp[i+2];
            int np=dp[i+1];
            dp[i]= Math.max(p,np);
        }
        return dp[0];
    }
}