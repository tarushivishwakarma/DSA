class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int l=0;
        for(int i=0;i<nums.length;i++){
            int r=sum-l-nums[i];
            if(l==r)
                return i;
            l+=nums[i];
        }
        return -1;



        // int ans[]=new int[nums.length];
        // ans[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     ans[i]=ans[i-1]+nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     int total=ans[nums.length-1];
        //     int l=(i==0)?0:ans[i-1];
        //     int r=total-ans[i];
        //     if(l==r)
        //         return i;
        // }
        // return -1;

        // int sum=0;
        // int sum2=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         sum2+=nums[j];
        //     }
        //     if(sum==sum2)
        //         return i;
        //     sum+=nums[i];
        //     sum2=0;
        // }
        // return -1;
    }
}