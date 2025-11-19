class Solution {
    public int compress(char[] chars) {
        int count=1;
        String ans=chars[0]+"";
        for(int i=1;i<chars.length;i++){
            //increase count
            if(chars[i]==chars[i-1])
            count++;
            else{
                if(count>1)
                ans+=count;
                ans+=chars[i];
                count=1;
            }
        }
        if(count>1)
        ans+=count;
        for(int i=0;i<ans.length();i++){
            chars[i]=ans.charAt(i);
        }
        return ans.length();
    }
}
