class Solution {
    public int reverseBits(int n) {
        int ans=0;
        int count=0;
        while(n!=0){
            ans=ans<<1;
            if((n&1)==1){
                ans=ans | 1;
            }
            n=n>>1;
            count++;
        }
        ans=ans<<32-count;
        return ans;
    }
}