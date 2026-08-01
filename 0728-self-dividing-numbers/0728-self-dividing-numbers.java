class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int j=i;
            int f=0;
            while(j>0){
                int d=j%10;
                if(d == 0 || i % d != 0)
                    break;
                j/=10;
            }
            if(j==0)
                ans.add(i);
        }
        return ans;
    }
}