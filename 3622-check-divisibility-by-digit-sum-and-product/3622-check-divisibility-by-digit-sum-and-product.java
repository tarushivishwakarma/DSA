class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int pro=1;
        int dig=0;
        int sum=0;
        while(n>0){
            int d=n%10;
            dig+=d;
            pro*=d;
            n/=10;
        }
        sum=pro+dig;
        return temp%sum==0;
    }
}