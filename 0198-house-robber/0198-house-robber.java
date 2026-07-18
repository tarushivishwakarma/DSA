class Solution {
    public int rob(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        return help(nums,0,arr);
    }
    static int help(int[] nums,int x,int[] arr){
        if(x>=nums.length)
            return 0;
        if(arr[x]!=-1)
            return arr[x];
        int p=nums[x]+help(nums,x+2,arr);
        int np=help(nums,x+1,arr);
        arr[x]= Math.max(p,np);
        return arr[x];
    }
    
}