class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i>=n;i++){
            int v=i;
            int pro=1;
            while(v!=0){
                int d=v%10;
                pro*=d;
                v/=10;
            }
            if(pro%t==0)
                return i;
        }
        return 0;
    }
}