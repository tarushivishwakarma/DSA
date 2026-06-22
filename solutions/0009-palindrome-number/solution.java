class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==x)
        return true;
        else
        return false;
    }
}
