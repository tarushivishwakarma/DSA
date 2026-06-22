class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
        return false;
        else if(n==1)
        return true;
        else{
            int i=1;
            while(Math.pow(2,i)<n){
                i++; 
            }
            if(Math.pow(2,i)==n){
                return true;
            }
            else
            return false; 
        }
    }
}
