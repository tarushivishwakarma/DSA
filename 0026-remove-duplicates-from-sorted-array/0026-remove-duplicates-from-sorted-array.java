class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return 1;
        else{
            int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
            return i+1;
        }
    }
}