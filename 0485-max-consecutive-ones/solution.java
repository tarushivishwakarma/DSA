class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int num = 0;  
        int count = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                num = Math.max(num, count);  
            }
            else {
                count = 0;
            }
        }        
        return num;
    }
}
