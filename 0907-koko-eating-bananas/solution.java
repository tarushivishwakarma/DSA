class Solution {
    boolean isPossible(int[]piles,int mid,int h){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=mid){
                hours++;
            }
            else if(piles[i]%mid==0){
                hours+=(piles[i]/mid);
            }
            else if(piles[i]%mid!=0){
                hours+=(piles[i]/mid)+1;
            }
            if(hours>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int start=1; //worst case
        int end=max; //best case
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2; //'mid' speed per hr of koko
            if (isPossible(piles,mid,h)){
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
