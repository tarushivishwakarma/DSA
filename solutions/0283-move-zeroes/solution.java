class Solution {
    public void moveZeroes(int[] nums) {
        int j=move(nums,0,0);
        fill(nums,j);
    }
    public int move(int[] nums,int i,int j){
        if(i==nums.length){
            return j;
        }
        if (nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
        return move(nums,i+1,j);
    }
    public void fill(int[] nums,int j){
        if(j==nums.length){
            return;
        }
        nums[j]=0;
        fill(nums,j+1);        
    }
}
