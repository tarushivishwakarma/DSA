class Solution {
    static boolean bananas(int[]piles,int h,int k){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum=sum+((piles[i]+k-1)/k);
            if(sum>h){
                return false;
            }
        }
        if(sum<=h){
            return true;
        }
        else{
            return true;
        }
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int l=1;
        int r=max;
        while(l<=r){
            int mid=(l+r)/2;
            if(bananas(piles,h,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}