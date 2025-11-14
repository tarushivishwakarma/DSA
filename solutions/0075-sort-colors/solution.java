class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i:nums){
            if(i==0)
            count0++;
            else if(i==1)
            count1++;
            else
            count2++;
        }
        int idx=0;
        while(count0>0){
            nums[idx]=0;
            count0--;
            idx++;
        }
        while(count1>0){
            nums[idx]=1;
            count1--;
            idx++;
        }
        while(count2>0){
            nums[idx]=2;
            count2--;
            idx++;
        }
    }
}
