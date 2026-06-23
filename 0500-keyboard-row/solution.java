class Solution {
    public int getCount(String copy,String row,int len){
        int count=0;
        for(int i=0;i<len;i++){
            char ch=copy.charAt(i);
            if(row.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        ArrayList<String> list=new ArrayList<>();
        for(String word:words){
            String copy=word.toLowerCase();
            int len=copy.length();
            int count1=getCount(copy,row1,len);
            int count2=getCount(copy,row2,len);
            int count3=getCount(copy,row3,len);
            if(count1==len || count2==len || count3==len){
                list.add(word);
            }
        }
        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
