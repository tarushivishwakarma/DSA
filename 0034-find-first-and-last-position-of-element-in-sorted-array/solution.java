class Solution {
    public int first(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                if(mid==0 || nums[mid-1]!=target)
                return mid;
                else
                r=mid-1;
            }else if(nums[mid]<target)
            l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    public int last(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                if(mid==(nums.length-1) || nums[mid+1]!=target)
                return mid;
                else
                l=mid+1;
            }else if(nums[mid]<target)
            l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int fidx=first(nums,target);
        int lidx=last(nums,target);
        int[] ans={fidx,lidx};
        return ans;
    }
}
