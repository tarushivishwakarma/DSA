class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R')
                count++;
            else
                count--;
            if(count==0)
                ans++;
        }
        return ans;
    }
}