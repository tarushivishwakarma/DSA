class Solution {
    public int jump(int[] nums) {
        int last=0;
        int jump=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==last){
                jump++;
                last=max;
            }
        }
        return jump;
    }
}