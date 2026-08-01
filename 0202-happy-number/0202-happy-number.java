class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ans=new HashSet<>();
        while(n!=1 && !ans.contains(n)){
            ans.add(n);
            n=happy(n);
        }
        return n==1;
    }
    int happy(int n){
        int s=0;
        while(n!=0){
            int d=n%10;
            s+=d*d;
            n/=10;
        }
        return s;
    }
}