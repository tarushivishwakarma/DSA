class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        int left=0;
        int right=n-1;
        while(left<right){
            char sc=s.charAt(left);  //startcharacter
            char ec=s.charAt(right);  //endcharacter
            if(!((sc>='a' && sc<='z') || (sc>='0' && sc<='9'))){
                left++;
            }
            else if(!((ec>='a' && ec<='z') || (ec>='0' && ec<='9'))){
                right--;
            }
            else{
                if(sc!=ec)
                return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
