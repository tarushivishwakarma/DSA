class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String arr[]=new String[words.length];
        for(String word:words){
            int v=word.charAt(word.length()-1)-'0';
            arr[v-1]=word.substring(0,word.length()-1);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            ans.append(arr[i]);
            if(i!=arr.length-1)
                ans.append(" ");
        }
        return ans.toString();
    }
}