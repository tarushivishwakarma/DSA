class Solution {
    public int maxProduct(int n) {
        int ans=0;
        while(n!=0){
            int d=n%10;
            int temp=n/10;
            while(temp!=0){
                int d2=temp%10;
                int pro=d*d2;
                ans=Math.max(pro,ans);
                temp/=10;
            }
            n/=10;
        }
        return ans;
    }
}