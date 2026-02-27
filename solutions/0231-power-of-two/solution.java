class Solution {
    boolean check(int i,int n){
        //base case
        if(Math.pow(2,i)>n){
            return false;
        }
        if (Math.pow(2,i)==n){
            return true;
        }
        //recursive case
        return check(i+1,n);
    }
    public boolean isPowerOfTwo(int n) {
        boolean ans=check(0,n);
        return ans;
    }
}
