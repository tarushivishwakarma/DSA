class Solution {
    boolean isPossible(int[] weights,int mid,int days){
        int day=1;
        int sum=0;
        for(int i=0;i<weights.length;){
            if((sum+weights[i])<=mid){
                sum+=weights[i];
                i++;
            }
            else{
                sum=0;
                day++;
            }
            if(day>days)
            return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int total=0;
        int ans=0;
        for(int i=0;i<weights.length;i++){
            total+=weights[i];
        }
        int start=1;
        int end=total;
        while(start<=end){
            int mid=(start+end)/2; //capacity of ship
            if(isPossible(weights,mid,days)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
