class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int max_length=-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                k--;
            }
            //shrink the window
            while(k==-1){
                if(nums[i]==0){
                    k++;
                }
                i++;
            }
            int window_length=(j-i)+1;
            max_length=Math.max(window_length,max_length);
        }   
        return max_length;
    }
}
